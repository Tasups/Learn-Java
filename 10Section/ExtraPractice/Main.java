import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        /* TESTS FROM PART III ************************************************************************/
        
        Scanner scanner = new Scanner(System.in);
    
        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);
    
        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);
    
        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);
    
        System.out.println("\nMagazine added to the library: " + newMagazine.toString());
        
        
        /* TESTS FROM PART II ************************************************************************/
        
        // Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        // Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);
    
        // MagazineLibrary library = new MagazineLibrary();
        
        // // Test the addMagazine method
        // library.addMagazine(magazine1);
        // library.addMagazine(magazine2);
    
        // // Test the getMagazine method
        // Magazine retrievedMagazine = library.getMagazine(0);
        // System.out.println(retrievedMagazine.getTitle());
        // System.out.println(retrievedMagazine.toString());
    
        // // Test the setMagazine method
        // Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
        // library.setMagazine(0, newMagazine);
    
        // // Verify that the magazine was updated
        // retrievedMagazine = library.getMagazine(0);
        // System.out.println(retrievedMagazine.getTitle());
        // System.out.println(retrievedMagazine.toString());
        
        /* TESTS FROM PART I ************************************************************************/
        
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
         return (input == null || input.isBlank());
    }
    
    public static boolean incorrectIssueNumber(int issueNumber) {
        return (issueNumber <= 0);
    }
    
    public static boolean incorrectPublicationYear(int publicationYear) {
        return (publicationYear <= 0); 
    }
    
    public static String promptForTitle(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid title: ");
            String title = scanner.nextLine();
            // boolean invalidInput = isNullOrBlank(title);
            if (!isNullOrBlank(title)) {
                return title;
            }
        }
    }
    
    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid publisher: ");
            String publisher = scanner.nextLine();
            // boolean invalidInput = isNullOrBlank(publisher);
            if (!isNullOrBlank(publisher)) {
                return publisher;
            }
        }
    }
    
    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid issue number, greater than 0: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int issueNumber = scanner.nextInt();
            if (!incorrectIssueNumber(issueNumber)) {
                return issueNumber;
            }
        }
    }
    
    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid publication year, greater than 0:");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int publicationYear = scanner.nextInt();
            if (!incorrectIssueNumber(publicationYear)) {
                return publicationYear;
            }
        }
    }
}