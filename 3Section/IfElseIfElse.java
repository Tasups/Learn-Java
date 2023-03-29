public class IfElseIfElse {
    public static void main(String[] args) {

        String weather = "cloudy";
        // sunny: System.out.println("It's a nice day for a walk.");
        if (weather.equals("sunny")) {
            System.out.println("It's a nice day for a walk.");
        } 
        // rainy: System.out.println("Bring an umbrella!");
        else if (weather.equals("rainy")) {
            System.out.println("Bring an umbrella!");
        }
        // otherwise: System.out.println("Not sure what to do in this weather.");
        else {
            System.out.println("Not sure what to do in this weather.");
        }

        int score = 85;
        // 80 and above: System.out.println("You got an A!");
        if (score >= 80) {
            System.out.println("You got an A!");
        } 
         // 70 and above: System.out.println("You got a B!");
        else if (score >= 70) {
            System.out.println("You got an B!");
        } 
        // 60 and above: System.out.println("You got a C.");
        else if (score >= 60) {
            System.out.println("You got an C.");
        } 
        // 50 and above: System.out.println("You got a D.");
        else if (score >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You failed :(");
        }
        // Otherwise: System.out.println("You failed :(");

        String jobTitle = "manager";
        // CEO: System.out.println("You're the boss!");
        if (jobTitle.equals("CEO")) {
            System.out.println("You're the boss!");
        } // manager: System.out.println("You're in charge of a team.");
        else if (jobTitle.equals("manager")) {
            System.out.println("You're in charge of a team.");
        }  // Otherwise: System.out.println("You're an employee.");
        else {
            System.out.println("You're an employee.");
        }
       

        char grade = 'B';
         // A: System.out.println("Excellent work!");
         if (grade == 'A') {
             System.out.println("Excellent work!");
         } // B: System.out.println("Good job!");
         else if (grade == 'B') {
             System.out.println("Good job!");
         }  // C: System.out.println("You did okay.");
         else if (grade == 'C') {
             System.out.println("You did okay.");
         }   // D: System.out.println("Hey, you still passed!");
         else if (grade == 'D') {
             System.out.println("Hey, you still passed!");
         }  // Otherwise: System.out.println("You failed :(");
         else {
             System.out.println("You failed :(");
         }
        
    }
}
