public class RollDoubles {
    
    public static void main(String[] args) {
        
        int rollOne = 0;
        int rollTwo = 1;
        
        while(rollOne != rollTwo) {
            rollOne = RNG();
            rollTwo = RNG();
            System.out.println("Die 1: " + rollOne);
            System.out.println("Die 2: " + rollTwo + "\n");
        }
        
        System.out.println("You rolled doubles!");
        
    }
    
    public static int RNG() {
        double randomDouble = Math.random() * 6 + 1;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
    
}