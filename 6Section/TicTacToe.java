import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    
    public static void main(String[] args) {
        
        System.out.println("Let's play TicTacToe\n");
        
        String[][] ticTacToeBoard = new String[3][3];
        
        initializeBoard(ticTacToeBoard);
        
        printBoard(ticTacToeBoard);
        
        boolean winner = false;
        
        Scanner scan = new Scanner(System.in);
        
        int row;
        int column;

        while (!winner) {
            System.out.println("Turn: X");
            System.out.print("- pick a row and column number: ");
            row = scan.nextInt();
            column = scan.nextInt();
            ticTacToeBoard[row][column] = " X ";
            printBoard(ticTacToeBoard);
            
            System.out.println("Turn: O");
            System.out.print("- pick a row and column number: ");
            row = scan.nextInt();
            column = scan.nextInt();
            ticTacToeBoard[row][column] = " O ";
            printBoard(ticTacToeBoard);
        }
     
        scan.close();
        
    }
    
    public static String[][] initializeBoard(String[][] board) {
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " _ ";
            }
        }
        return board;
    }
    
    public static void printBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.print("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("\n");
        }
    }
    
}