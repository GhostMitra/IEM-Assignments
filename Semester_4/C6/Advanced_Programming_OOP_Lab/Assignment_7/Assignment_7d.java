package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;

class NullDemo {
    private String text;

    public NullDemo(String text) {
        this.text = text.equalsIgnoreCase("null") ? null : text;
    }

    public int getLength() {
        try {
            return text.length();
        } catch (NullPointerException e) {
            out.println("Error: Cannot call method on a null object.");
            return -1;
        }
    }
}

public class Assignment_7d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter a string (type 'null' to simulate NullPointerException): ");
        String input = sc.nextLine();
        NullDemo n = new NullDemo(input);
        out.println("Length: " + n.getLength());
        sc.close();
    }
}
