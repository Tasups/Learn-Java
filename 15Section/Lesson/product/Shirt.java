package product;

public class Shirt extends Product {
   
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}
    
    public Shirt(String brand, String color, double price, Size size) {
        // super needs to be called here to send these arguments to the parent or super class to be constructed
        super(brand, color, price);
        setSize(size);
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    @Override
    public void fold() {
        // this invokes the fold method inside the super or parent class
        super.fold();
        System.out.println("Lay shirt on a flat surface");
        System.out.println("Fold in half");
        System.out.println("Fold sleeves in");
        System.out.println("Fold in half from bottom up");
    }
    
    @Override
    public String wear() {
        return "The " + this.size + " seems to fit you well!";
    }

    @Override
    public String toString() {
        return "Shirt: " + this.size + " " + super.getColor() + " " + super.getBrand() + " $" + super.getPrice();
    }
    
}