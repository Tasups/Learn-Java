import java.util.Arrays;
import java.util.Scanner;

public class HangJack {
    
    public static void main(String[] args) {
        
        System.out.println("Let's play HangJack: Fruit Edition!\n");
        
        System.out.print(drawMan(0) + "\n");
        
        String word = getWord(RNG());
        int wordLength = word.length();
        
        System.out.print("\t" + createInitialBoard(wordLength) + "\n\n");
        
        char[] wordToArray = new char[wordLength];
        wordToArray = stringToArray(word, wordLength);
        // this needs to be changed to an array full of _
        System.out.println(Arrays.toString(wordToArray));
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please select a letter: ");
        char letter = scan.next().charAt(0);
        scan.close();
        
        int counter = 0;
        for (int i = 0; i < wordLength; i++) {
            if (letter == word.charAt(i)) {
                counter++;
            }
        }
        
        int[] indicesToUpdate = new int[counter];
        indicesToUpdate = createIndicesToUpdateArray(word, letter, wordLength, indicesToUpdate);
        System.out.println(Arrays.toString(indicesToUpdate));
        
        System.out.println();
        String updatedBoard = updateBoard(indicesToUpdate, wordLength, letter);
        System.out.println(updatedBoard);
        
    }
    
    public static int[] createIndicesToUpdateArray(String word, char letter, int wordLength, int[] indicesToUpdate) {
        // keeps count of how many times the letter shows up so that we're storing only the instances where the letter shows up
        int insertionCounter = 0;
        // walks through the word and stores the index where the letter shows up in the word
        for (int j = 0; j < wordLength; j++) {
            if (letter == word.charAt(j)) {
                indicesToUpdate[insertionCounter] = j;
                insertionCounter++;
            }
        }
        return indicesToUpdate;
    }
    
    public static char[] updateWordArray(String ) {
        int counter = 0;
        for (int i = 0; i < wordToArray.length; i++) {
            if (counter < wordToArray.length && indicesToUpdate[counter] == i ){
                wordToArray[i] = letter;
                counter++;
            } else {
                wordToArray[i] = '_';
            }
        }
        return wordToArray;
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
    
    // public static String createBoard(int wordLength) {
    //     String board = " ";
    //     for (int i = 0; i < wordLength; i++) {
    //         if (wordToArray.charAt(i) != "_"){
    //             board += " " + wordToArray.charAt(i);
    //         }
    //         else {
    //             board += "_ ";
    //         }
    //     }
    // }
    
    public static String createInitialBoard(int wordLength) {
        String board = " ";
        for (int i = 0; i < wordLength; i++) {
            board += "_ ";
        }
        return board;
    }
    
    public static char[] stringToArray(String word, int wordLength) {
        char[] wordToArray = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            wordToArray[i] = word.charAt(i);;
        }
        return wordToArray;
    }
    
    public static int RNG() {
        double randomNumber = Math.random() * 10;
        return (int)randomNumber;
    }
    
    public static String getWord(int num) {
        String[] fruits = {"apple", "orange", "banana", "strawberry", "raspberry", "grapes", "peach", "cantaloupe", "watermelon", "blackberry"};
        return fruits[num];
    }
    
    public static String drawMan(int num) {
        
        switch(num) {
            case 0:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t        | \n"+
                       "\t        | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 1:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t        | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 2:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t   |    | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 3:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t   |/   | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 4:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t  \\|/   | \n"+
                       "\t        | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 5:
                return "\t   ______ \n"+
                       "\t   |    | \n"+
                       "\t   O    | \n"+
                       "\t  \\|/   | \n"+
                       "\t  /     | \n"+
                       "\t  ______|_\n"+
                       "\t  |      |\n";
                       
            case 6:
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