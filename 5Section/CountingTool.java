import java.util.Scanner;

public class CountingTool {
    
    public static void main(String[] args) {
        
        System.out.print("Hi Timmy! ");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose a number to count to: ");
        int countTarget = scan.nextInt();
        scan.close();
        
        System.out.println("Great! Here's how it's done: ");
        
        for (int i = 0; i <= countTarget; i++) {
            if (i == countTarget) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}