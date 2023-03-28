import java.util.Scanner;

public class JavaGram {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("What is your username?");
        String username = scanner.nextLine();
        
        System.out.println("What city do you live in?");
        String city = scanner.nextLine();
        
        System.out.println("What country do you live in?");
        String country = scanner.nextLine();
        
        scanner.close();
        
        System.out.println("\nThank you for joining JavaGram!");
        
        System.out.println("\nHere is the information that you provided:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);
    }
    
}