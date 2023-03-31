import java.util.Scanner;

public class Signin {
    
    public static void main(String[] args) {
        
        String username = "Tasups";
        String password = "LearnJava#1";
        
        System.out.println("Welcome to Javagram! Sign in below\n");

        Scanner scan = new Scanner(System.in);
        
        String userNameInput = "";
        String userPasswordInput= "";
        
        while(!userNameInput.equals(username) || !userPasswordInput.equals(password)) {
            System.out.print("- Username: ");
            userNameInput = scan.nextLine();
            System.out.print("- Password: ");
            userPasswordInput = scan.nextLine();
            System.out.println("\nIncorrect, please try again!\n");
        }
        
        System.out.println("Sign in successful! Welcome!");
       
        scan.close();
        
    }
    
}