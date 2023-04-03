public class HighScore {
    
    public static void main(String[] args) {
        
        int[] scores;
        
        scores = new int[10];
        
        for (int i = 0; i < 10; i++) {
            scores[i] = RNG();
        } 
        
        int highScore = 0;
        
        System.out.print("Here are the scores: ");
        for (int j = 0; j < scores.length; j++) {
            System.out.print(scores[j] + " ");
            if (scores[j] > highScore) {
                highScore = scores[j];
            }
        }
        
        System.out.println("\nThe high score is: " + highScore + ". Give that person a cookie!");
        
    }
    
    public static int RNG() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
    
}