import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

class BufferedCharStreamHandler {
    private String fileName;
    private String content;

    public BufferedCharStreamHandler(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public int writeToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
            out.println("Content written to \"" + fileName + "\" successfully.");
            return content.length();
        } catch (IOException e) {
            out.println("IOException while writing: " + e.getMessage());
            return -1;
        }
    }

    public String readFromFile() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            out.println("Content read from \"" + fileName + "\":");
            out.println(sb.toString().trim());
        } catch (IOException e) {
            out.println("IOException while reading: " + e.getMessage());
            return "";
        }
        return sb.toString().trim();
    }
}

public class Assignment_8d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter filename to write to (e.g. output.txt): ");
        String fileName = sc.nextLine();
        out.print("Enter string to write: ");
        String content = sc.nextLine();
        BufferedCharStreamHandler bcs = new BufferedCharStreamHandler(fileName, content);
        out.println("Characters Written: " + bcs.writeToFile());
        bcs.readFromFile();
        sc.close();
    }
}
