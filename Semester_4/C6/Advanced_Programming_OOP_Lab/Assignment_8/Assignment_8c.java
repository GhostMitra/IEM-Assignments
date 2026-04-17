import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

class BufferedImageCopier {
    private String source;
    private String destination;

    public BufferedImageCopier(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public int copy() {
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
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

public class Assignment_8c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter source image file path (e.g. input.jpg): ");
        String source = sc.nextLine();
        out.print("Enter destination file path (e.g. output.jpg): ");
        String destination = sc.nextLine();
        BufferedImageCopier bic = new BufferedImageCopier(source, destination);
        out.println("Bytes Copied: " + bic.copy());
        sc.close();
    }
}
