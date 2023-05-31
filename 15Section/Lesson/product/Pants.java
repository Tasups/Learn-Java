package product;

public class Pants extends Product {

    private int length;
    private int waist;
    
    public Pants(String brand, String color, double price, int length, int waist) {
        // super needs to be called here to send these arguments to the parent or super class to be constructed
        super(brand, color, price);
        setLength(length);
        setWaist(waist);
    }
    
    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }
    
    // Override actually overides a method from a parent/super class
    @Override
    public void fold() {
        // this invokes the fold method inside the super or parent class
        super.fold();
        System.out.println("Hold pants upright");
        System.out.println("Fold in half horizontally");
        System.out.println("Fold in thirds, leaving waist band at front");
    }
    
    @Override
    public String wear() {
        return "The " + waist + " " + length + " pants look good on you!";
    }

}