import java.util.Scanner;

public class Javapedia {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("************JavaPedia************");
        System.out.println("How many historical figures will you register?");
        int numToRegister = scan.nextInt();
        // break the nextLine trap
        scan.nextLine();
        
        String[][] database = new String[numToRegister][3];
        
        // for (int i = 0; i < numToRegister; i++) {
        //     for (int j = 0; j < database[i].length; j++) {
        //         System.out.print(database[i][j] + " ");
        //     }
        //     System.out.println(" ");
        // }
        
        for (int i = 0; i < numToRegister; i++) {
            System.out.println("\n\tFigure " + (i + 1));
            for (int j = 0; j < database[i].length; j++) {
                 
                 switch (j) {
                    case 0: System.out.print("\t- Name: "); 
                        String name = scan.nextLine();
                        database[i][j] = name;
                        break;
                    case 1: System.out.print("\t- Date of Birth: "); 
                        String birthDate = scan.nextLine();
                        database[i][j] = birthDate;
                        break;
                    case 2: System.out.print("\t- Occupation: "); 
                        String occupation = scan.nextLine();
                        database[i][j] = occupation;
                        break;
                 }
            }
        }
        System.out.println(" ");
        
        System.out.println("These are the values you have stored:");
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < database[i].length; j++) {
                System.out.print(database[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        System.out.print("Who would you like information on? \n");
        String query = scan.nextLine();
        
        
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(query)){
                for (int j = 0; j < database[i].length; j++) {
                    
                    switch (j) {
                        case 0: System.out.print("Name: ");
                        System.out.println(database[i][j]);
                        break;
                        case 1: System.out.print("Date of Birth: ");
                        System.out.println(database[i][j]);
                        break;
                        case 2: System.out.print("Occupation: ");
                        System.out.println(database[i][j]);
                        break;
                    }
                }
            }
        }
        
        scan.close();
    }
    
}