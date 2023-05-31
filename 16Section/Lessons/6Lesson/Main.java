import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Arrays;
import java.io.IOException;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        
        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};
        // THIS WILL ALLOW YOU TO GET A STREAM FROM MANY DATASOURCES!!!!!! REMEMBER THIS!!!!
        Arrays.stream(greetings).forEach(greeting -> System.out.println(greeting));

        System.out.println("\n***********************************\n");

        // Creating Stream from Datasource: File
        try {
            Path path = Paths.get("chorus.txt");
            Files.lines(path).forEach(line -> System.out.println(line));
        } catch(IOException exception) {
            System.out.println(exception);
        }
    }
}