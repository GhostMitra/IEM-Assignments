package Assignment_7;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;

class FileOpener {
    private String fileName;

    public FileOpener(String fileName) {
        this.fileName = fileName;
    }

    public int open() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            out.println("File opened successfully: " + fileName);
            return 1;
        } catch (FileNotFoundException e) {
            out.println("Error: File \"" + fileName + "\" not found.");
            return -1;
        }
    }
}

public class Assignment_7l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter filename to open (e.g. data.txt): ");
        String fileName = sc.nextLine();
        FileOpener f = new FileOpener(fileName);
        out.println("Status Code: " + f.open());
        sc.close();
    }
}
