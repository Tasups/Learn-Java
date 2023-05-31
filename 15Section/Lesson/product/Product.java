package product;

// by making the Product class ABSTRACT, we're making it so that we can't create a Product object
// that wouldn't actually have a specific type. It wouldn't make sense to make an object 
// when we don't know what it is. A shirt is a shirt and pants are pants, but,
// what exactly would a Product be?
public abstract class Product {
    
    private String brand;
    private String color;
    private double price;
    
    
    public Product(String brand, String color, double price) {
        setBrand(brand);
        setColor(color);
        setPrice(price);
    }
    
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 
    public void fold() {
        System.out.println("Folding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }
    
    // this is to start a method that can be shared with the child classes and MUST 
    // be defined in each child class
    public abstract String wear();

}