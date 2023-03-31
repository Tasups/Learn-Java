import java.util.Scanner;

public class Bart{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String phrase = scan.nextLine();
        System.out.println("How many times do you want me to write that?");
        int times = scan.nextInt();
        scan.close();
        
        for (int i = 1; i < times + 1; i++) {
            System.out.println(i + " " + phrase);
        }
    }
    
}