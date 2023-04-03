import java.util.Scanner;

public class BlackJack {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String cardBack =   "   _____\n"+              
                            "  |     |\n"+ 
                            "  |  J  |\n"+
                            "  | JJJ |\n"+
                            "  |  J  |\n"+
                            "  |_____|\n";
        
        System.out.println("Let's play BlackJack!\nHere's the rules: \n");
        
        System.out.println("It's a card game and the rules are simple:\n");
        System.out.println("At the beginning, you will get two cards.");
        System.out.println("We add up your cards to determine your total.");
        System.out.println("The purpose of the game is to get to 21 without going over.\n");
        System.out.println("You start first.\nYou will get your cards first and then can choose to 'hit', get another card.");
        System.out.println("Or you can 'stay' and stay with the cards and the total that you have.");
        System.out.println("After you stay, the dealer will try to get to 21 as well, however...\n");
        System.out.println("They HAVE to hit unless their total is 17. Thus, it is sometimes likely that the dealer will 'bust', or go over 21 points.");
        System.out.println("Each card is worth the number they are, thus, a six of spades is worth six points. Face cards are worth ten points.\n");
        System.out.println("Done reading the rules? Hit enter to play.\n");
        String doneWithRules = scan.nextLine();
        
        int playerTotal = 0;
        int dealerTotal = 0;
        String hiddenCard = "";
        
        // to start PLAYER with two cards
        for (int i = 1; i <= 2; i++) {
            int randomNumber = RNG();
            if(playerTotal < 11 && randomNumber == 1) {
                randomNumber = 11;
            }
            int scoreUpdate = scoreHandler(randomNumber);
            playerTotal += scoreUpdate;
            String playerCard = cardFace(randomNumber);
            System.out.println("Player Card " + i + "\n" + playerCard + "\n");
        }
        // to start DEALER with two cards
        for (int i = 1; i <= 2; i++) {
            int randomNumber = RNG();
            if(dealerTotal < 11 && randomNumber == 1) {
                randomNumber = 11;
            }
            int scoreUpdate = scoreHandler(randomNumber);
            dealerTotal += scoreUpdate;
            String dealerCard = cardFace(randomNumber);
            if (i == 1) {
                System.out.println("Dealer Card " + i + "\n" + dealerCard + "\n");
            } else {
                hiddenCard = dealerCard;
                System.out.println("Dealer Hidden Card\n" + cardBack);
            }
        }
        
        
        System.out.print("Your total is: " + playerTotal + "\nWould you like to 'hit' or 'stay'? ");
        String hitOrStay = scan.nextLine();
        
        while (!hitOrStay.equals("stay")) {
            int randomNumber = RNG();
            if(playerTotal < 11 && randomNumber == 1) {
                randomNumber = 11;
            }
            int scoreUpdate = scoreHandler(randomNumber);
            playerTotal += scoreUpdate;
            String playerCard = cardFace(randomNumber);
            System.out.println("Player Card \n" + playerCard);
            if (playerTotal > 21) {
                System.out.println("Your total is: " + playerTotal + ". The dealer's total is: " + dealerTotal + ". YOU LOSE!!!");
                System.exit(0);
            }
            System.out.print("Your total is: " + playerTotal + "\nWould you like to 'hit' or 'stay'? ");
            hitOrStay = scan.nextLine();
        }
        
        while (dealerTotal < 17) {
            int randomNumber = RNG();
            if(dealerTotal < 11 && randomNumber == 1) {
                randomNumber = 11;
            }
            int scoreUpdate = scoreHandler(randomNumber);
            dealerTotal += scoreUpdate;
            String dealerCard = cardFace(randomNumber);
            System.out.println("Dealer Card\n" + dealerCard);
            if (dealerTotal > 21) {
                System.out.println("Dealer's total is " + dealerTotal + "! The dealer busts!! YOU WIN!!");
                System.exit(0);
            }
        }
        
        if (playerTotal > dealerTotal) {
            System.out.println("The dealer's hidden card is:\n" + hiddenCard);
            System.out.println("Your total is: " + playerTotal + ". The dealer's total is: " + dealerTotal + ". YOU WIN!!!");
        } else {
            System.out.println("The dealer's hidden card is:\n" + hiddenCard);
            System.out.println("Your total is: " + playerTotal + ". The dealer's total is: " + dealerTotal + ". YOU LOSE!!!");
        }
        
        scan.close();
        System.exit(0);
    }
    
    public static int scoreHandler(int num) {
         if (num > 10) {
            return 10;
        } else {
            return num;
        }
    }
    
    public static int RNG() {
        double randomDouble = Math.random() * 13 + 1;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
    
    public static String cardFace(int num) {
        
        switch(num) {
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
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            case 6:
                return
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            case 7:
                return
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8:
                return
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
                return
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10:
                return
                    "   _____ \n" +
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
                String error = "There was an error in the RNG function, as the number was out of bounds.";
                return error;
        }
    }
    
     // int playerRanNum1 = RNG();
        // int playerRanNum2 = RNG();
        // int scoreUpdate1 = scoreHandler(playerRanNum1);
        // int scoreUpdate2 = scoreHandler(playerRanNum2);
        // playerTotal += scoreUpdate1;
        // playerTotal += scoreUpdate2;
        // String playerCard1 = cardFace(playerRanNum1);
        // String playerCard2 = cardFace(playerRanNum2);
        // System.out.println("Player Card 1\n" + playerCard1);
        // System.out.println("Player Card 2\n" + playerCard2);
    
}