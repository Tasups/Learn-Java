import java.util.Scanner;

public class GuessTheNumber {
    
    public static void main(String[] args) {
        
        int targetNumber = RNG();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int guess = scan.nextInt();
        
        while (guess != targetNumber) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }
        
        System.out.println("You guessed it! The number was: " + guess + "!");
        
        scan.close();
    }
    
    public static int RNG() {
        double randomNumber = Math.random() * 5;
        int result = ((int)randomNumber) + 1;
        return result;
    }
}