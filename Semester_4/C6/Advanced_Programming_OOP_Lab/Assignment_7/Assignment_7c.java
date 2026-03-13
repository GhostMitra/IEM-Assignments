package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;

class StringConverter {
    private String input;

    public StringConverter(String input) {
        this.input = input;
    }

    public int convert() {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            out.println("Error: \"" + input + "\" cannot be converted to an integer.");
            return -1;
        }
    }
}

public class Assignment_7c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter a value to convert to integer: ");
        String input = sc.nextLine();
        StringConverter s = new StringConverter(input);
        out.println("Converted Value: " + s.convert());
        sc.close();
    }
}
