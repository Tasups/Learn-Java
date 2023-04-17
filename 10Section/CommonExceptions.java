import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {

        //**************ArrayIndexOutOfBounds**************//
        int[] grades = new int[] {96, 65, 56, 86};
        // the below line throws a Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // System.out.println(grades[4]);
        // there is no 4th index, so fix it with an acceptable index call
        System.out.println(grades[3]);

       //**************NullPointerException**************//
        String[] names = new String[7]; 
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        // the below lines throw an Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "<local6>" is null
        // because the array has 7 values and only 3 are initialized with something other than "null"
        // fix by using an if statement
        for (String name : names) {
            if (name != null){
                System.out.println(name.toUpperCase());    
            }
        }

        //**************InputMismatchException**************//
        // to make this error "work", you have to input a string instead of an integer, doing so will throw this error
        // Exception in thread "main" java.util.InputMismatchException
        // to fix this, use an if statement to catch if its an integer and scan.next() if its not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer");
        if (scanner.hasNextInt()) {
            scanner.nextInt();
        } else {
            scanner.next();
        }
        scanner.close();
    }
}