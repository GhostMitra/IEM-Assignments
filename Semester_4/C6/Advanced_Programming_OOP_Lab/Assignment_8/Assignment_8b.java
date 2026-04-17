import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

class CharStreamHandler {
    private String fileName;
    private String content;

    public CharStreamHandler(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public int writeToFile() {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(content);
            out.println("Content written to \"" + fileName + "\" successfully.");
            return content.length();
        } catch (IOException e) {
            out.println("IOException while writing: " + e.getMessage());
            return -1;
        }
    }

    public String readFromFile() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(fileName)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                sb.append((char) ch);
            }
            out.println("Content read from \"" + fileName + "\":");
            out.println(sb.toString());
        } catch (IOException e) {
            out.println("IOException while reading: " + e.getMessage());
            return "";
        }
        return sb.toString();
    }
}

public class Assignment_8b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter filename to write to (e.g. output.txt): ");
        String fileName = sc.nextLine();
        out.print("Enter string to write: ");
        String content = sc.nextLine();
        CharStreamHandler cs = new CharStreamHandler(fileName, content);
        out.println("Characters Written: " + cs.writeToFile());
        cs.readFromFile();
        sc.close();
    }
}
