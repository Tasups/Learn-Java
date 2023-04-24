import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        
        try {
            Path path = Paths.get("emails.txt");
            Files.lines(path)
                // there's got to be a better way of doing this!
                .filter(email -> email.startsWith("Primary") || email.startsWith("Social") || email.startsWith("Promotions"))
                .forEach(line -> System.out.println(line));
        } catch(IOException exception) {
            System.out.print(exception);
        }
        
        
    }
}