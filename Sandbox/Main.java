public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("It goes on");

        System.out.println(andOn(0));

    }
    
    public static String andOn(int num) {
        int count = num;
        String andOn = "";
        while(count < 3) {
            andOn += "and on ";
            count++;
        }
        return andOn;
    }
    
}