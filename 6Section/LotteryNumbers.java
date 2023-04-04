import java.util.Arrays;

public class LotteryNumbers {
    
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] numbers = Arrays.copyOf(ticket, ticket.length);
        numbers[2] = 54;
         
        // System.out.println(Arrays.toString(ticket));
        // System.out.println(Arrays.toString(numbers));

        System.out.print("Ticket 1 numbers:" + printoutArrays(ticket));
        System.out.println("Ticket 2 numbers:" + printoutArrays(numbers));
    }
    
    public static String printoutArrays(int[] array) {
        String number = "";
        for (int i = 0; i < array.length; i++) {
            number += " " + array[i];
        }
        number += "\n\n";
        return number;
    } 
    
}