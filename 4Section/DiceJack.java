import java.util.Scanner;

public class DiceJack {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int roll1 = rollDie();
        int roll2 = rollDie();
        int roll3 = rollDie();
        
        System.out.println("Enter three numbers between 1 - 6");
        int dieOne = scan.nextInt();
        int dieTwo = scan.nextInt();
        int dieThree = scan.nextInt();
        if (dieOne < 1 || dieOne > 6 || dieTwo < 1 || dieTwo > 6 || dieThree < 1 || dieThree > 6) {
            System.out.println("Invalid input. Please pick a number between 1-6.");
            System.exit(0);
        }
        
        int compDiceTotal = addDice(roll1, roll2, roll3);
        int playerDiceTotal = addDice(dieOne, dieTwo, dieThree);
        
        determineResults(compDiceTotal, playerDiceTotal);
        
        scan.close();
    }
    
    /*
    Function name: rollDie
    @return dieRoll
    
    Inside the function: 
    1. randomly generates a number between 1-6
    
    */
    
    public static int rollDie() {
        double dieRoll = Math.random() * 6;
        dieRoll++;
        return (int)dieRoll;
    }
    
    /*
    Function name: addDice
    @ dieOne (int)
    @ dieTwo (int)
    @ dieThree (int)
    @ return diceTotal (int)
    
    Inside the function: 
    1. adds the die to get a total
    
    */
    
    public static int addDice(int dieOne, int dieTwo, int dieThree) {
        int diceTotal = dieOne + dieTwo + dieThree;
        return diceTotal;
    }
    
    /*
    Function name: determineResults
    @ compTotal (int)
    @ diceTotal (int)
    
    Inside the function: 
    1. computes the difference from playerDicetotal and compDiceTotal
    2. finds whether the player made a higher roll than the computer but is within 3 of the computer, if so, the player wins
    3. determines response if player doesn't win
    
    */
    
    public static void determineResults(int compDiceTotal, int playerDiceTotal) {
        int underThree = playerDiceTotal - compDiceTotal;
        System.out.println("The computer rolled a total of: " + compDiceTotal);
        System.out.println("You rolled a total of: " + playerDiceTotal + "\n");
        if (playerDiceTotal > compDiceTotal && underThree <= 3 && underThree > 0) {
            System.out.println("Which means that you rolled over the computer's total by " + underThree + ". You win! \nCongratulations!!!");
        } else if (compDiceTotal == playerDiceTotal) {
            System.out.println("It's a tie.");
        } else if (compDiceTotal > playerDiceTotal) {
            System.out.println("The computer wins.");
        } else {
            System.out.println("You rolled more than 3 over the computer.\nYou lose.");
        }
    }
    
}