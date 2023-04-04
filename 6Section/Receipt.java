import java.util.Arrays;

public class Receipt {
    
    public static void main(String[] args) {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[4];
        
        for (int i = 0; i < price.length; i++) {
            double withTax = price[i] * 1.13;
            afterTax[i] = withTax;
        }
        
        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(afterTax));
    }
    
}