public class FightRecord {
    
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        
        int wins = 0;
        int losses = 0;
        int ties = 0;
        
        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                wins++;        
            } else if (record[i].equals("LOSS")) {
                losses++;
            } else {
                ties++;
            }
        }
        
        System.out.println("With a professional record of " + wins + " wins, " + losses + " losses, and " + ties + " ties,");
        System.out.println("they are the pride of Oracle: Java Fury!");
        
    }
    
}