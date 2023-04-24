import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        System.out.println("\n**************************************");
        //map: transform each name into this greeting "Hello, " + name + "!"
        names.stream().map(name -> name = "Hello, " + name + "!").forEach(name -> System.out.println(name));
            
   
        System.out.println("\n**************************************");
        
        List<String> usernames = Arrays.asList("sparklingunicorn", "galactic_goddess", "neon_ninja", "purplepixiedust");
     
        //filter: keep the username that matches neon_ninja
        String username = usernames.stream()
            .filter(uname -> uname.equals("neon_ninja"))
            .findFirst()
            .orElse(null);
        
        String response = username == null ? "Sorry, cannot find username." : "Found you, " + username + "! You dirty fucking bastard!";
     
        System.out.println(response);

        System.out.println("\n**************************************");
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //. filter: keep the numbers that are even.
        // count(): count the number of elements in the stream.

        long numEven = numbers.stream().filter(num -> num % 2 == 0).count();
        
        System.out.println("There are " + numEven + " even numbers in this list");
        
    }   
    
}

