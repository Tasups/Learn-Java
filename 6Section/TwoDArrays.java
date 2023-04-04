import java.util.Arrays;

public class TwoDArrays {
    
    public static void main(String[] args) {
        int[][] grades = new int[3][4];
        // or, simply do this:
        int[][] easyArrayOfGrades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };
        
        // System.out.println("Harry: " + Arrays.toString(easyArrayOfGrades[0]));
        // System.out.println("Ron: " + Arrays.toString(easyArrayOfGrades[1]));
        // System.out.println("Hermione: " + Arrays.toString(easyArrayOfGrades[2]));
        
        for (int i = 0; i < easyArrayOfGrades.length; i++) {
            
            switch (i) {
                case 0: System.out.print("Harry: "); break;
                case 1: System.out.print("Ron: "); break;
                case 2: System.out.print("Hermione: "); break;
                default: System.out.print("Error"); break;
            }
            
            for (int j = 0; j < easyArrayOfGrades[i].length; j++) {
                System.out.print(easyArrayOfGrades[i][j] + " ");
            }
            System.out.println(" ");
        }
      
        

    }
    
}