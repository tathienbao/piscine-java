import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java CatInFile <filename>");
            return;
        }

        String filename = args[0];
        try (OutputStream outputStream = new FileOutputStream(filename)) {
            InputStream inputStream = System.in;
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}