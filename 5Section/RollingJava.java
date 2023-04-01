import java.util.Scanner;

public class RollingJava {
    
    public static void main(String[] args) {
        
        System.out.println("Let's play Rolling Java. Type anything to start.");
        
        Scanner scan = new Scanner(System.in);
        String anything1 = scan.nextLine();
        
        System.out.println("Great, here are the rules: ");
        System.out.println("- If you roll a 6, the game stops.\n- If you roll a 4, nothing happens.\n- Otherwise, you get 1 point.\n");
       
        int total = 0;
        
        while (total < 3) {
            System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");
            String anything2 = scan.nextLine(); 
            System.out.println(" ");
            
            int randomNumber = RNG();
            System.out.println(randomNumber);
            
            if (randomNumber == 6) {
                System.out.println("End of game.");
                System.exit(0);
            } else if (randomNumber == 4) {
                System.out.println("Zero points. Keep rolling.");
            } else {
                total++;
                System.out.println("You scored 1 point. Your point total is: " + total + ". Almost there! Keep rolling!");
            }
        }
        
        System.out.println("Wow, that's lucky! You win!!");
        
        scan.close();
    }
    
    public static int RNG() {
        double randomDouble = Math.random() * 6 + 1;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
    
}