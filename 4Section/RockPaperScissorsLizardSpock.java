import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
    
    public static void main(String[] args) {
        int computerChoice = RNG();
        String computerGamePiece = gamePiece(computerChoice);
        
        System.out.println("What game piece would you like to use?");
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
        } else if (num == 2){
            String piece = "scissors";
            return piece;
        } else if (num == 2){
            String piece = "lizard";
            return piece;
        } else {
            String piece = "Spock";
            return piece;
        }
    }
    
    public static String whoWon(String computerChoice, String playerChoice) {
        String result = "";
        if (computerChoice == "rock" && playerChoice == "rock" || computerChoice == "paper" && playerChoice == "paper" || computerChoice == "scissors" && playerChoice == "scissors" || computerChoice == "lizard" && playerChoice == "lizard" || computerChoice == "Spock" && playerChoice == "Spock") {
            result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". The result is a tie.";
        } else if (computerChoice == "rock" && playerChoice == "scissors" || computerChoice == "rock" && playerChoice == "lizard") {
            result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since rock crushes "  + playerChoice + ", you lose!";
        } else if (computerChoice == "paper" && playerChoice == "rock" || computerChoice == "paper" && playerChoice == "Spock") {
            if (playerChoice == "rock") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since paper covers rock, you lose!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since paper disproves Spock, you lose!";
            }
        } else if (computerChoice == "scissors" && playerChoice == "paper" || computerChoice == "scissors" && playerChoice == "lizard") {
            if (playerChoice == "paper") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since scissors cuts paper, you lose!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since scissors decapitates lizard, you lose!";
            }
        } else if (computerChoice == "lizard" && playerChoice == "paper" || computerChoice == "lizard" && playerChoice == "Spock") {
            if (playerChoice == "paper") { 
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since lizard eats paper, you lose!";
            } else {
                result = "You chose " + playerChoice + " and the computer chose " + computerChoice + ". Since lizard poisons Spock, you lose!";
            }
        }
        return result;
    }
    
}