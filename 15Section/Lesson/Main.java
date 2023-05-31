import product.Pants;
import product.Shirt;
import product.Product;
import product.Shirt.Size;

public class Main {
    
    public static void main(String[] args) {
        
        // an object of the Shirt class can be treated as an object of the Product class
        // Shirt shirt = new Shirt(); you think you could do this:
        // Product shirt = new Shirt(); however, Product doesn't have the methods that Shirt does
        // so we need to use the most specific class to define instances of classes
        
        // Shirt parameters String brand, String color, double price, Size size
        Shirt shirt = new Shirt("UnderArmor", "Blue", 20.99, Size.LARGE);
        System.out.println(shirt.toString());
        shirt.fold();
        
        
        // Pants parameters String brand, String color, double price, int length, int waist
        Pants pants = new Pants("OshKosh", "Khaki", 45.99, 30, 42);
        pants.fold();
        
        productStore(shirt);
        productStore(pants);
        
        System.out.println("Here's a " + shirt.getColor() + " " + shirt.getBrand() + " shirt on sale for $" + shirt.getPrice() + ".\nIts a " + shirt.getSize() + " do you think that'll fit?");
        System.out.println("Here's a " + pants.getColor() + " " + pants.getBrand() + " pair of pants on sale for $" + pants.getPrice() + ".\nIt has a " + pants.getWaist() + " inch waist and a " + pants.getLength() + " inch length. Do you think that'll fit?");
        
    }
    
    public static void productStore(Product product) {
            System.out.println("\nThanks for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to " + product.getPrice() + "\n" + product.wear());
        }
    
}