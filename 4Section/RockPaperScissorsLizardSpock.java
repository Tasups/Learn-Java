import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
    
    public static void main(String[] args) {
        int computerChoice = RNG();
        String computerGamePiece = gamePiece(computerChoice);
        
        System.out.println("Let's play Rock, Paper, Scissors, Lizard, Spock.\n\nHere are the rules:\nScissors cuts paper, paper covers rock, rock crushes lizard, \nlizard poisons Spock, Spock smashes scissors, scissors decapitates lizard, \nlizard eats paper, paper disproves Spock, Spock vaporizes rock, \nand rock crushes scissors. \n\nWhoever throws the winning signal wins! If both of you make the same signal, it's a tie.\n");
        System.out.println("What game signal would you like to use?");
        System.out.println("(1) for 'rock'\n(2) for 'paper'\n(3) for 'scissors'\n(4) for 'lizard'\n(5) for 'Spock'");
        
        Scanner scan = new Scanner(System.in);
        int userChoice = scan.nextInt();
        scan.close();
        
        String playerGamePiece = gamePiece(userChoice);
        
        String result = whoWon(computerGamePiece, playerGamePiece);
        
        System.out.println(result);
    }
    
    public static int RNG() { 
        double randomNum = (Math.random() * 5) + 1;
        int convertRandomNum = (int)randomNum;
        return convertRandomNum;
    }
    
    public static String gamePiece(int num) {
        if (num == 1) {
            String piece = "rock";
            return piece;
        } else if (num == 2){
            String piece = "paper";
            return piece;
        } else if (num == 3){
            String piece = "scissors";
            return piece;
        } else if (num == 4){
            String piece = "lizard";
            return piece;
        } else {
            String piece = "Spock";
            return piece;
        }
    }
    
    public static String whoWon(String computerChoice, String playerChoice) {
        String result = "";
        // ties
        if (computerChoice == "rock" && playerChoice == "rock" || computerChoice == "paper" && playerChoice == "paper" || computerChoice == "scissors" && playerChoice == "scissors" || computerChoice == "lizard" && playerChoice == "lizard" || computerChoice == "Spock" && playerChoice == "Spock") {
            result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". The result is a tie.";
        } 
        /******  COMPUTER WINS GAME  ********/ 
        // computer picks rock and wins
        else if (computerChoice == "rock" && playerChoice == "scissors" || computerChoice == "rock" && playerChoice == "lizard") {
            result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since rock crushes "  + playerChoice + ", you lose!";
        } 
        // computer picks paper and wins
        else if (computerChoice == "paper" && playerChoice == "rock" || computerChoice == "paper" && playerChoice == "Spock") {
            if (playerChoice == "rock") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since paper covers rock, you lose!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since paper disproves Spock, you lose!";
            }
        // computer pickes scissors and wins
        } else if (computerChoice == "scissors" && playerChoice == "paper" || computerChoice == "scissors" && playerChoice == "lizard") {
            if (playerChoice == "paper") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since scissors cuts paper, you lose!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since scissors decapitates lizard, you lose!";
            }
        // computer picks lizard and wins
        } else if (computerChoice == "lizard" && playerChoice == "paper" || computerChoice == "lizard" && playerChoice == "Spock") {
            if (playerChoice == "paper") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since lizard eats paper, you lose!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since lizard poisons Spock, you lose!";
            }
        // computer picks Spock and wins
        } else if (computerChoice == "Spock" && playerChoice == "scissors" || computerChoice == "Spock" && playerChoice == "rock") {
            if (playerChoice == "scissors") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since Spock smashes scissors, you lose!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since Spock vaporizes rock, you lose!";
            }
        } 
        /******  PLAYER WINS GAME  ********/ 
        // player picks rock and wins
        else if (computerChoice == "scissors" && playerChoice == "rock" || computerChoice == "lizard" && playerChoice == "rock") {
            result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since rock crushes "  + playerChoice + ", you win!";
        } 
        // player picks paper and wins
        else if (computerChoice == "rock" && playerChoice == "paper" || computerChoice == "Spock" && playerChoice == "paper") {
            if (computerChoice == "rock") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since paper covers rock, you win!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since paper disproves Spock, you win!";
            }
        // player pickes scissors and wins
        } else if (computerChoice == "paper" && playerChoice == "scissors" || computerChoice == "lizard" && playerChoice == "scissors") {
            if (computerChoice == "paper") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since scissors cuts paper, you win!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since scissors decapitates lizard, you win!";
            }
        // player picks lizard and wins
        } else if (computerChoice == "paper" && playerChoice == "lizard" || computerChoice == "Spock" && playerChoice == "lizard") {
            if (computerChoice == "paper") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since lizard eats paper, you win!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since lizard poisons Spock, you win!";
            }
        // player picks Spock and wins
        } else if (computerChoice == "scissors" && playerChoice == "Spock" || computerChoice == "rock" && playerChoice == "Spock") {
            if (computerChoice == "scissors") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since Spock smashes scissors, you win!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since Spock vaporizes rock, you win!";
            }
        }
        return result;
    }
    
}