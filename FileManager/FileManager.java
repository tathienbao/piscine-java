import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);
        } catch (IOException e) {
            throw new IOException("An error occurred while creating the file: " + e.getMessage(), e);
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try {
            Files.lines(Path.of(fileName)).forEach(line -> content.append(line).append("\n"));
            return content.toString();
        } catch (IOException e) {
            throw new IOException("An error occurred while reading the file: " + e.getMessage(), e);
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (!file.delete()) {
            System.err.println("Failed to delete the file");
        }
    }
}