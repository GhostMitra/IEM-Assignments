function Assignment_5
    % Create the UI figure
    fig = uifigure('Name','Simple Calculator','Position',[500 300 400 350]);

    % Input fields
    uilabel(fig,'Text','Input A:','Position',[30 280 60 30]);
    num1Field = uieditfield(fig,'numeric','Position',[100 285 100 25]);

    uilabel(fig,'Text','Input B:','Position',[30 240 60 30]);
    num2Field = uieditfield(fig,'numeric','Position',[100 245 100 25]);

    % Dropdown for operations
    uilabel(fig,'Text','Operation:','Position',[30 200 70 30]);
    opMenu = uidropdown(fig,'Items',{'Addition','Subtraction','Multiplication','Division',...
                                     'Combination (nCr)','Permutation (nPr)',...
                                     'Percentage','Log base b (log_b(a))'},...
                        'Position',[100 205 180 25]);

    % Output field
    uilabel(fig,'Text','Result:','Position',[30 150 60 30]);
    resultField = uieditfield(fig,'text','Editable','off','Position',[100 155 180 25]);

    % Button
    calcBtn = uibutton(fig,'Text','Calculate','Position',[150 100 100 30],...
                       'ButtonPushedFcn',@(btn,event) doCalculate());

    % Calculation function
    function doCalculate()
        a = num1Field.Value;
        b = num2Field.Value;
        choice = opMenu.Value;
        try
            switch choice
                case 'Addition'
                    result = a + b;
                case 'Subtraction'
                    result = a - b;
                case 'Multiplication'
                    result = a * b;
                case 'Division'
                    if b == 0
                        result = 'Error: Division by zero';
                    else
                        result = a / b;
                    end
                case 'Combination (nCr)'
                    result = nchoosek(a,b);
                case 'Permutation (nPr)'
                    result = factorial(a) / factorial(a-b);
                case 'Percentage'
                    result = (a / b) * 100;
                case 'Log base b (log_b(a))'
                    result = log(a) / log(b);
            end
            resultField.Value = num2str(result);
        catch ME
            resultField.Value = ['Error: ' ME.message];
        end
    end
end
