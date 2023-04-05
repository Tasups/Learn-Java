import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    
    public static void main(String[] args) {
        
        System.out.println("Let's play TicTacToe\n");
        
        String[][] ticTacToeBoard = new String[3][3];
        
        initializeBoard(ticTacToeBoard);
        
        printBoard(ticTacToeBoard);
        
        String winner = null;
        
        Scanner scan = new Scanner(System.in);
        
        int row;
        int column;

        while (winner == null) {
            System.out.println("Turn: X");
            System.out.print("- pick a row and column number: ");
            row = scan.nextInt() - 1;
            column = scan.nextInt() - 1;
            System.out.println("\n");
            while (ticTacToeBoard[row][column] != " _ ") {
                System.out.print("That position is taken, try again: ");
                row = scan.nextInt() - 1;
                column = scan.nextInt() - 1;
                System.out.println("\n");
            }
            ticTacToeBoard[row][column] = " X ";
            
            printBoard(ticTacToeBoard);
            winner = checkWinner(ticTacToeBoard);
            if (winner != null) {break;}
            
            System.out.println("Turn: O");
            System.out.print("- pick a row and column number: ");
            row = scan.nextInt() - 1;
            column = scan.nextInt() - 1;
            System.out.println("\n");
            while (ticTacToeBoard[row][column] != " _ ") {
                System.out.print("That position is taken, try again: ");
                row = scan.nextInt() - 1;
                column = scan.nextInt() - 1;
                System.out.println("\n");
            }
            ticTacToeBoard[row][column] = " O ";
            printBoard(ticTacToeBoard);
            winner = checkWinner(ticTacToeBoard);
            if (winner != null) {break;}
        }
        
        System.out.println("Congratulations!" + winner + "is the winner!!");
     
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
    
    public static String checkWinner(String[][] board) {
        String X = " X ";
        String O = " O ";
        // Horizontal win scenarios
        if (board[0][0] == X && board[0][1] == X && board[0][2] == X) {
            return X;
        } else if (board[0][0] == O && board[0][1] == O && board[0][2] == O) {
            return O;
        } else if (board[1][0] == X && board[1][1] == X && board[1][2] == X) {
            return X;
        } else if (board[1][0] == O && board[1][1] == O && board[1][2] == O) {
            return O;
        } else if (board[2][0] == X && board[2][1] == X && board[2][2] == X) {
            return X;
        } else if (board[2][0] == O && board[2][1] == O && board[2][2] == O) {
            return O;
        }
        // Vertical win scenarios
          else if (board[0][0] == X && board[1][0] == X && board[2][0] == X) {
            return X;
        } else if (board[0][0] == O && board[1][0] == O && board[2][0] == O) {
            return O;
        } else if (board[0][1] == X && board[1][1] == X && board[2][1] == X) {
            return X;
        } else if (board[0][1] == O && board[1][1] == O && board[2][1] == O) {
            return O;
        } else if (board[0][2] == X && board[1][2] == X && board[2][2] == X) {
            return X;
        } else if (board[0][2] == O && board[1][2] == O && board[2][2] == O) {
            return O;
        }
        // Diagonal win scenarios
          else if (board[0][0] == X && board[1][1] == X && board[2][2] == X) {
            return X;
        } else if (board[0][0] == O && board[1][1] == O && board[2][2] == O) {
            return O;
        } else if (board[0][2] == X && board[1][1] == X && board[2][0] == X) {
            return X;
        } else if (board[0][2] == O && board[1][1] == O && board[2][0] == O) {
            return O;
        } else {
            return null;
        }
    }
    
    
}
