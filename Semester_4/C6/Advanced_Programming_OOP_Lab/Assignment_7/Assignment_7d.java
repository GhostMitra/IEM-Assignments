package Assignment_7;
public class Assignment_7d {
    public static void main(String[] args) {
        String s = null;
        try
        {
            System.out.println("Inside try block\nString = " + s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Catched NullPointerException");
        }
    }
}
