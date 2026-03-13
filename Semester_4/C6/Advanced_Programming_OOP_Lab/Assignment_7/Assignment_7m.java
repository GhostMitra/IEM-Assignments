package Assignment_7;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

class FileCharReader {
    private String fileName;

    public FileCharReader(String fileName) {
        this.fileName = fileName;
    }

    public int readChar() {
        try {
            FileReader fr = new FileReader(fileName);
            int ch = fr.read();
            fr.close();
            out.println("First character read: " + (char) ch);
            return ch;
        } catch (IOException e) {
            out.println("IOException: " + e.getMessage());
            return -1;
        }
    }
}

public class Assignment_7m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter filename to read from (e.g. data.txt): ");
        String fileName = sc.nextLine();
        FileCharReader f = new FileCharReader(fileName);
        out.println("Character Code: " + f.readChar());
        sc.close();
    }
}
