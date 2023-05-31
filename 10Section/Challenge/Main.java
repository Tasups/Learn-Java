import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;


public class Main {
    
    static Store store = new Store();
    
    public static void main(String[] args) {
        
        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
    
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";
    
        while (status.equals("continue")) {
            int choice = (promptForChoice(scanner));
            Movie movie = store.getMovie(choice);
            double rating = promptForRating(scanner, movie.getName());
    
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }
    
    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            // 1. Anticipate the user not entering an integer.
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                // 2. Anticipate the choice being incorrect.
                if (choice < 0 || choice > 9) {
                    System.out.println("Your choice must be between 0 - 9 and be a whole number");
                }
                return choice;
            }
        }
    }
    
    public static boolean incorrectChoice(int choice) {
        if (choice < 0 || choice > 9) {
            return true;
        }
        return false;
    }
    
    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            // 1. Anticipate the user not entering a double.
            if (scanner.hasNextDouble()) {
                double rating = scanner.nextDouble();
                // 2. Anticipate the rating being incorrect.
                if (rating < 0 || rating > 10) {
                    System.out.println("Your rating must be between 0 - 10 and must be a number");
                }
                return rating;
            }
         }
    }
    
    public static boolean incorrectRating(double rating) {
        if (rating < 0 || rating > 10) {
            return true;
        }
        return false;
    }
    
    public static void loadMovies(String filename) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        Scanner scanFile = new Scanner(fis);
        
        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        scanFile.close();
    }
    
    public static void printStore() {
        System.out.println("********************MOVIE STORE********************");
        System.out.println(store);
    }
    
}