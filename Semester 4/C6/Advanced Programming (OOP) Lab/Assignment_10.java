
public class Assignment_10 
{
    Assignment_10()
    {
        this(5);
        System.out.println("Default Constructor Called");
    }
    Assignment_10(int a)
    {
        this("Hello");
        System.out.println("Integer Constructor Called " + a);
    }
    Assignment_10(String str)
    {
        System.out.println("String Constructor Called " + str);
    }
    public static void main(String[] args) 
    {
        Assignment_10 obj = new Assignment_10();
    }
}
