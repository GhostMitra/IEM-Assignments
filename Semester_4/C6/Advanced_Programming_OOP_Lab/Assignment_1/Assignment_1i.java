package Assignment_1;
import java.util.Scanner;
import static java.lang.System.out;

class Login {
    private String username;
    private String password;

    // Constructor
    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isValidPassword() {
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
                break;
            }
        }

        if (password.length() >= 8 && hasDigit)
            return true;
        else
            return false;
    }

    String validate() {
        if (isValidPassword())
            return "Password is Strong";
        else
            return "Password is Weak (must be 8+ chars and contain digit)";
    }
}

public class Assignment_1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out.print("Enter username: ");
        String user = sc.nextLine();

        out.print("Enter password: ");
        String pass = sc.nextLine();

        Login login = new Login(user, pass);

        out.println("\nResult: " + login.validate());

        sc.close();
    }
}
