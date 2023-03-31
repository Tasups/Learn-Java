import java.util.Scanner;

public class CounterTool {
    
    public static void main(String[] args) {
        
        System.out.println("Let's play a counting game.");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Pick a number to county by: ");
        int interval = scan.nextInt();
        System.out.print("Pick a number to start counting from: ");
        int start = scan.nextInt();
        System.out.print("Pick a number to count to: ");
        int end = scan.nextInt();
        scan.close();
        
        count(interval, start, end);
    }
    
    public static void count(int interval, int start, int end) {
        for (int i = start; i <= end; i += interval) {
            if (i == end) {
                System.out.println(i);
            }
            System.out.print(i + " ");
        }
    }
    
}