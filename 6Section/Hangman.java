import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
    
    public static void main(String[] args) {
        
        System.out.println("Let's play Hangman, Fruit Edition!\n");
        System.out.print(drawMan(1) + "\n");
        
        String word = getWord(RNG());
        int wordLength = word.length();
        
       
        System.out.print("\t" + createBoard(wordLength) + "\n");

        System.out.println("\t" + word);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please select a letter: ");
        char letter = scan.next().charAt(0);
        scan.close();
        
        // finds how many times the letter exists so that we can create an array with the right amount of indices
        int counter = 0;
        for (int i = 0; i < wordLength; i++) {
            if (letter == word.charAt(i)) {
                System.out.print(i + " ");
                counter++;
            }
        }
        
        System.out.println("\ncounter: " + counter);
        // create an array to store the indices of where the letter is found in the letter
        int[] indicesToUpdate = new int[counter];
        // keeps count of how many times the letter shows up so that we're storing only the instances where the letter shows up
        int insertionCounter = 0;
        // walks through the word and stores the index where the letter shows up in the word
        for (int i = 0; i < wordLength; i++) {
            if (letter == word.charAt(i)) {
                indicesToUpdate[insertionCounter] = i;
                insertionCounter++;
            }
        }
        
        System.out.println("\ninsertionCounter: " + insertionCounter);
        System.out.println("indices array: " + Arrays.toString(indicesToUpdate));
        
        System.out.println(updateBoard(indicesToUpdate, wordLength, letter));
        
        //now we just have to recreate the board replacing letters in the correct indices
        // for (int i = 0; i < wordLength; i++) {
        //     if (indices[i] == i){
        //         board[i] = letter;
        //     }
        // }
        
    
    }
    
    
    public static String updateBoard(int[] indicesToUpdate, int wordLength, char letter) {
        String board = " ";
        int counter = 0;
        for (int i = 0; i < wordLength; i++) {
            if (counter < indicesToUpdate.length && indicesToUpdate[counter] == i ){
                board += letter + " ";
                counter++;
            } else {
                board += "_ ";
            }
        }
        return board;
    }
    
    public static String createBoard(int num) {
        String board = " ";
        for (int i = 0; i < num; i++) {
            board += "_ ";
        }
        return board;
    }
    
    public static String getWord(int num) {
        String[] fruits = {"apple", "orange", "banana", "strawberry", "raspberry", "grapes", "peach", "cantaloupe", "watermelon", "blackberry"};
        return fruits[num];
    }
    
    public static int RNG() {
        double randomNumber = Math.random() * 10;
        return (int)randomNumber;
    }
    
    public static String drawMan(int num) {
        
        switch(num) {
            case 1:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t        | \n"+
                       "\t        | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 2:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t        | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 3:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t   |    | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 4:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t   |/   | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 5:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t  \\|/   | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 6:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t  \\|/   | \n"+
                       "\t  /     | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 7:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t  \\|/   | \n"+
                       "\t  / \\   | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                
            default:
                return "error";
        }
    }
    
}