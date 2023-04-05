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
        
        int[] indices = new int[10];
        int counter = 0;
        
        for (int i = 0; i < wordLength; i++) {
            if (letter == word.charAt(i)) {
                System.out.print(i + " ");
                indices[counter] = i;
                counter++;
            }
        }
        
        System.out.print(Arrays.toString(indices));

        // for (int i = 0; i < wordLength; i++) {
        //     if(i == )
        // }
    
    }
    
    public static String createBoard(int num) {
        String board = " ";
        for (int i = 0; i < num; i++) {
            board+= "_ ";
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