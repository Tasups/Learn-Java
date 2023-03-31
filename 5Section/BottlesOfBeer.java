import java.util.Scanner;

public class BottlesOfBeer {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many bottles of beer are on the wall?");
        int numberOfBottles = scan.nextInt();
        scan.close();
        
        Sing(numberOfBottles);
        
    }
    
    public static void Sing(int num) {
        
        String bottles;
        
        for (int i = num; i > 0 ; i--) {
            if (i == 1){
                bottles = "bottle";
            } else {
                bottles = "bottles";
            }
            
            System.out.println(i + " " + bottles + " of beer on the wall. " + i + " " + bottles + " of beer!");
            System.out.println("Take one down, pass it around. " + (i - 1) + " bottles of beer on the wall!");
        }
    }
    
}