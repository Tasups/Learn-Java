public class Scope {
    
    // DOGS VARIABLE IS CLASS SCOPED!
    // YOU HAVE TO MAKE THE VARIABLE STATIC IF ITS TO BE CALLED FROM A STATIC FUNCTION!!!
    static int dogs = 10;
    
    public static void main(String[] args) {
        int apples = 5;
        // The next line won't work due to functionally scoped variable
        // System.out.println(oranges);
        System.out.println(dogs);
    }
    
    public static void some() {
        int oranges = 4;
        // The next line won't work due to functionally scoped variable
        // System.out.println(apples);
        System.out.println(dogs);
    }
    
}