public class RollDoubles {
    
    public static void main(String[] args) {
        
        int rollOne = RNG();
        int rollTwo = RNG();
        
        System.out.println("Die 1: " + rollOne);
        System.out.println("Die 2: " + rollTwo);
        
    }
    
    public static int RNG() {
        double randomDouble = Math.random() * 6;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
    
}