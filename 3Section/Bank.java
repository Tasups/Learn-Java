import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String choice = scan.nextLine();
        
        switch (choice) {
            case "yes": 
                //Task 2 - Print this if the decision is "yes"
                System.out.println("\nGreat! In one line" +
                "\nHow much money do you have in your savings?" +
                "\nAnd, how much do you owe in credit card debt?");
                // Task 3 - Pick up each value 
                double savings = scan.nextDouble();
                double creditCardDebt = scan.nextDouble();
                
                System.out.println("\nHow many years have you worked for?");
                int years = scan.nextInt();
                scan.nextLine();
                // Task 4 - Pick up number of years
    
                System.out.println("What is your name?");
                // Task 5 - Pick up the user's name
                String name = scan.nextLine();
                
                //Task 6 - Approve the mortgage if they meet the requirements (see article)
                //       - Otherwise, don't give them a mortgage.
                
                /*at least $10,000 in their savings account.
                less than $5,000 in credit card debt.
                more than 2 years of work experience.
                */
                
                if (savings >= 10_000 && creditCardDebt < 5_000 && years > 2) {
                    System.out.println("Congratulations " + name + ", you have been approved!");
                } else {
                    System.out.println("Sorry, you are not eligible for a mortgage.");
                } 

                break;
                
            case "no":
                System.out.println("\nOK. Have a nice day!");
                break;
                
            default: System.out.println("You gave an invalid input " + choice + ". Please enter 'yes' or 'no'.");
        }

        scan.close();
    }
}
