public class BooleanComparisons {
    public static void main(String[] args) {
        
        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("Java: " + (biologyGrade > chemistryGrade) + " should be false.\n");
        
        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        System.out.println("Java: " + (sales > costs) + " should be true.\n");

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        System.out.println("Java: " + (temperature < targetTemperature) + " should be true.\n");

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        System.out.println("Java: " + (currentSpeed < speedLimit) + " should be true\n");

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        System.out.println("Java: " + (age >= 65) + " should be false\n");

        double salary = 50000.0;
        double maxSalary = 60000.0;
        System.out.println("Me: Hi Java, is my salary less than or equal to the maximum salary?");
        System.out.println("Java: " + (salary <= maxSalary) + " should be true\n");

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        System.out.println("Java: " + (myGrade == bestGrade) + " should be true.\n");
        
        int phoneNumber = 5551234;
        int contactNumber = 5551234;
        System.out.println("Me: Hi Java, is this the correct phone number for my contact?");
        System.out.println("Java: " + (phoneNumber == contactNumber) + " should be true.\n");
        
        char letter1 = 'a';
        char letter2 = 'b';
        System.out.println("Me: Hi Java, are these two letters different?");
        System.out.println("Java: " + (letter1 != letter2) + " should be true.\n");
        
        long distance1 = 1000L;
        long distance2 = 500L;
        System.out.println("Me: Hi Java, are these two distances not equal?");
        System.out.println("Java: " + (distance1 != distance2) + " should be true.\n");

        String word = "hello";
        String secondWord = "hello";

        System.out.println("Me: Are the two words the same?");
        System.out.println("Java: " + word.equals(secondWord) + " should be true.\n");
        System.out.println("Java: " + word == secondWord + " should be true, but is false due to memory allocation.\n");
        System.out.println("Java: " + (word == secondWord) + " should be true and does work for some reason due to the parens used.\n");


        String thirdWord = "hello";
        String fourthWord = "goodbye";

        System.out.println("Me: Are the two words different");
        System.out.println("Java: " + !thirdWord.equals(fourthWord) + " should be true.\n");
        System.out.println("Java: " + thirdWord != fourthWord + " should be true and is, except it breaks our string.\n");
        System.out.println("Java: " + (thirdWord != fourthWord) + " should be true and does work for some reason due to the parens used.\n");


    }
}