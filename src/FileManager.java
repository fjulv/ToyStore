import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    public static void writeFile(String filePath, String text) {
        try {
            Path path = Paths.get(filePath);
            Files.writeString(path, text);
        } catch (IOException e) {
            System.out.println("Error writing file " + e.getMessage());
        }
    }
}

