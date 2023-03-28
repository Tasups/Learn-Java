public class Decimals {
    
    public static void main(String[] args) {
        double percentage = 73.5;
        System.out.println(percentage + " of percentages are made up.");
        
        // this shows that you should never use, or rarely use, int with math equations.
        // if double was int, you'd get 6, not 6.6667
        double wallet = 20;
        int people = 3;
        System.out.println(wallet / people);
    }
    
}