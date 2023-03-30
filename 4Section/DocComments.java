public class DocComments {
    
    public static void main(String[] args) {
        
    }
    
    /*
    Function name: greet
    
    Inside function: 
    1. prints Hi!
    
    */
    public static void greet() {
        System.out.println("Hi!");
    }
    
    /*
    Function name: printText
    @name (String)
    @age (int)
    
    inside function:
    1. prints name and age as a part of a String.
    
    */
    
    public static void printText(String name, int age) {
        System.out.println("Hi, my name is " + name + ", I'm " + age + " years old.");
    }
    
    /*
    Function name: calculateArea
    @length     (double)
    @width      (double)
    @return     (double)
    
    inside function:
    1. calculates the area and returns it
    
    */
    
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
    
}