import java.util.Scanner;

public class Main {
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        
        System.out.println("We are setting up your user account.");
        
        // the below line throws Exception in thread "main" java.lang.IllegalArgumentException: Username cannot be null or blank
        // this was handled in the User.java file under setUsername;
        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        String username = scanner.nextLine();
        
        if (username.isBlank()) {
            System.out.println("Sorry, that is an invalid username");
        } else {
            user.setUsername(username);
        }
        
        int age = 0;
        
        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Sorry that is an invalid age");
            } else {
                user.setAge(age);
            }
        } else {
            scanner.nextLine();
        }
        scanner.close();
        
        System.out.println( "Your account has been created. Username: " + username + " Age: " + age + "");
        
    }
    
    
}