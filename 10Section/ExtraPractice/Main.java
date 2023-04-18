import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);
    
        MagazineLibrary library = new MagazineLibrary();
        
        // Test the addMagazine method
        library.addMagazine(magazine1);
        library.addMagazine(magazine2);
    
        // Test the getMagazine method
        Magazine retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());
        System.out.println(retrievedMagazine.toString());
    
        // Test the setMagazine method
        Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
        library.setMagazine(0, newMagazine);
    
        // Verify that the magazine was updated
        retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());
        System.out.println(retrievedMagazine.toString());
        
        // Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        // System.out.println(magazine1.toString());
        // System.out.println(magazine1.getTitle());
    
        // Uncomment the following line to test invalid input for setTitle method
        // magazine1.setTitle("");
    
        // Uncomment the following line to test invalid input for setPublisher method
        // magazine1.setPublisher("");
    
        // Uncomment the following line to test invalid input for setIssueNumber method
        // magazine1.setIssueNumber(-1);
    
        // Uncomment the following line to test invalid input for setPublicationYear method
        // magazine1.setPublicationYear(0);
    
        // Uncomment the following line to test invalid input for the constructor
        // Magazine magazine2 = new Magazine("", "Publisher 2", 2, 2020);
    }
    
    public static boolean isNullOrBlank(String input) {
        if (input == null || input.isBlank()) {
            return true;
        }
    }
    
    public static boolean incorrectIssueNumber(int issueNumber) {
        if (issueNumber <= 0) {
            return true;
        }
    }
    
    public static boolean incorrectPublicationYear(int publicationYear) {
        if (publicationYear <= 0) {
            return true;
        }
    }
    
    public static String promptForTitle(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid title: ");
            String title = scanner.nextLine();
            isNullOrBlank(title);
        }
        return title;
    }
    
    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid publisher: ");
            String publisher = scanner.nextLine();
            isNullOrBlank(publisher);
        }
        return publisher;
    }
    
    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.println("Please enter a valid issue number, greater than 0: ");
            if (scanner.hasNextInt()) {
                int issueNumber = scanner.nextInt();
            } else {
                int issueNumber = scanner.next();
            }
        }
    }
    
    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.println("Please enter a valid publication year, greater than 0:");
            if (scanner.hasNextInt()) {
                int publicationYear = scanner.nextInt();
            } else {
                int publicationYear = scanner.next();
            }
        }
    }
}