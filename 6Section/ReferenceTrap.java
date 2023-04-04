import java.util.Arrays;

public class ReferenceTrap {
    
    public static void main(String[] args) {
        
        // String[] staffLastYear = {"Paul", "Jason", "Max", "Will", "Marsden"};
        // String[] staffThisYear = staffLastYear;
        // System.out.println(Arrays.toString(staffLastYear));
        // System.out.println(Arrays.toString(staffThisYear));
        // // THIS IS THE REFERENCE TRAP DEMONSTRATED. DUE TO staffThisYear = staffLastYear, YOU ACTUALLY HAVE THEM BOTH POINTING TO THE SAME REF. DON'T DO THIS! INSTEAD, MAKE A NEW ARRAY AND RUN A FOR LOOP TO COPY ALL OF THE CONTENTS FROM ONE INTO THE NEW ONE.
        // staffThisYear[4] = "Empty";
        // System.out.println(Arrays.toString(staffLastYear));
        // System.out.println(Arrays.toString(staffThisYear));
        
        // EXAMPLE OF MAKING A NEW ARRAY AND COPYING THE OLD CONTENTS INTO THE NEW ONE
        
        
        String[] menu2022 = {"apples", "oranges", "grapes", "bananas", "cantaloupe"};
        // System.out.println(Arrays.toString(menu2022));
        // new array of same length
        String[] menu2023 = new String[menu2022.length];
        for (int i = 0; i < menu2022.length; i++) {
            menu2023[i] = menu2022[i];
        }
        
        menu2023[0] = "popcorn";
        
        // System.out.println(Arrays.toString(menu2022));
        // System.out.println(Arrays.toString(menu2023));
        
        // A SIMPLER WAY TO COPY AN ARRAY'S CONTENTS INTO ANOTHER ONE
        
        String[] skills = {"JavaScript", "XHTML", "CSS3", "Python", "Java"};
        String[] newSkills = Arrays.copyOf(skills, skills.length);
        
        newSkills[1] = "HTML5";
        
        System.out.println(Arrays.toString(skills));
        System.out.println(Arrays.toString(newSkills));
        
    }
    
}