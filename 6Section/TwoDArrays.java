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
        
        System.out.println("Harry: " + Arrays.toString(easyArrayOfGrades[0]));
        System.out.println("Ron: " + Arrays.toString(easyArrayOfGrades[1]));
        System.out.println("Hermione: " + Arrays.toString(easyArrayOfGrades[2]));
        
        System.out.println("Harry's grades: Potions " + easyArrayOfGrades[0][0] + ", Herbology " + easyArrayOfGrades[0][1] + ", Arithmancy " + easyArrayOfGrades[0][2] + ", and Charms " + easyArrayOfGrades[0][3] + ".");
        
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;
        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;
        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;
        
        // System.out.println("Harry: " + Arrays.toString(grades[0]));
        // System.out.println("Ron: " + Arrays.toString(grades[1]));
        // System.out.println("Hermione: " + Arrays.toString(grades[2]));
        

    }
    
}