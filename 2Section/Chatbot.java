import java.util.Scanner;

public class Chatbot {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        
        System.out.println("\nHi " + name + ", I'm JavaBot. Where are you from?");
        String place = scanner.nextLine();
        
        System.out.println("\nI hear it's beautiful in " + place + ". I'm from a place called Oracle. \nHow old are you?");
        double age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\nSo you're " + age + " years old. I'm about 400 years old. \nThat means that I'm about " + Math.round(400 / age) + " times older than you.");
        System.out.println("That's enough about me. What's your favorite language. (Please don't say Python).");
        String favoriteLanguage= scanner.nextLine();
        
        scanner.close();
        
        System.out.println("\n" + favoriteLanguage + ", that's great! It's been nice chatting with you. " + name + ", I have to log off now. Have a smiley day!");
        
    }
    
}