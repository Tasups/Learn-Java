import java.util.Scanner;

public class Pokerito {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        String start = scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("- There are two players, you and the computer.");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw five cards (the river).");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner!\n");
        System.out.println("- Ready? Press enter to start.");
        String beginGame = scan.nextLine();
        
        int userRandomNumber = RNG();
        int computerRandomNumber = RNG();
        
        int userScore = 0;
        int computerScore = 0;
        
        String userCardFace = card(userRandomNumber);
        String computerCardFace = card(computerRandomNumber);
        
        System.out.println("Your Card:\n\n" + userCardFace);
        System.out.println("Computer's Card:\n\n" + computerCardFace);
        
        System.out.println("\nNow, hit enter to draw a card and run the river");    
        String runTheRiver = scan.nextLine();
        
        for(int i = 0; i < 5; i++) {
            
            if (i != 0) {
                System.out.println("Hit enter to draw a card: ");
                scan.nextLine();
            }
          
           
            System.out.println("Card " + (i + 1));
            int randomNumber = RNG();
            // how to store the cardnumber for scoring
            
            if (randomNumber == userRandomNumber) {
                userScore++;
            } 
            if (randomNumber == computerRandomNumber) {
                computerScore++;
            }
            
            int cardNumber = randomNumber;
            String cardFace = card(randomNumber);
            System.out.print(cardFace + " \n");
        }
        
        System.out.println("Your number of matches: " + userScore);
        System.out.println("Computer's number of matches: " + computerScore);
        
        if (userScore > computerScore) {
            System.out.println("You win!");
        } else if (computerScore > userScore) {
            System.out.println("You lose!");
        } else {
            System.out.println("It's a tie!");
        }
        
          scan.close();
    }
    
    public static int RNG() {
        double randomDouble = Math.random() * 13 + 1;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
    
    public static String card(int num) {
        
        switch (num) {
            case 1:
                return
                   "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
          
            case 2:
                return
                    "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  
            case 3:
                return
                  "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

            case 4:
                return
                   "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
                return
                    "   _____\n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
                return
                    "   _____\n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
                return
                    "   _____\n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          
            case 8:
                return
                    "   _____\n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
             
            case 9:
                return
                    "   _____\n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
                return
                    "   _____\n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            
            case 11:
                return
                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            
            case 12:
                return
                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
              
            case 13:
                return
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
                    
            default: 
                String error = "The RNG function created a number out of range.";
                return error;
        }     
    }
    
}