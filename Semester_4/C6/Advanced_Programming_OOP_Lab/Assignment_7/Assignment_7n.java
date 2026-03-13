package Assignment_7;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

class IOThrowsDemo {
    private String fileName;

    public IOThrowsDemo(String fileName) {
        this.fileName = fileName;
    }

    public int readFile() throws IOException {
        FileReader fr = new FileReader(fileName);
        int ch = fr.read();
        fr.close();
        out.println("First character: " + (char) ch);
        return ch;
    }
}

public class Assignment_7n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter filename to read from (e.g. data.txt): ");
        String fileName = sc.nextLine();
        IOThrowsDemo io = new IOThrowsDemo(fileName);
        try {
            out.println("Character Code: " + io.readFile());
        } catch (IOException e) {
            out.println("Caught in main - IOException: " + e.getMessage());
        }
        sc.close();
    }
}
