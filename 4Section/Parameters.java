public class Parameters {
    
    public static void main(String[] args) {
        calculateArea(1.9, 4.5);
    }
    
    public static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area: " + area);
    }
    
}