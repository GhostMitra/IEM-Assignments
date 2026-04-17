import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

class ImageCopier {
    private String source;
    private String destination;

    public ImageCopier(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public int copy() {
        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }
            out.println("File copied successfully from \"" + source + "\" to \"" + destination + "\"");
            out.println("Total bytes copied: " + totalBytes);
            return totalBytes;
        } catch (IOException e) {
            out.println("IOException: " + e.getMessage());
            return -1;
        }
    }
}

public class Assignment_8a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter source image file path (e.g. input.jpg): ");
        String source = sc.nextLine();
        out.print("Enter destination file path (e.g. output.jpg): ");
        String destination = sc.nextLine();
        ImageCopier ic = new ImageCopier(source, destination);
        out.println("Bytes Copied: " + ic.copy());
        sc.close();
    }
}
