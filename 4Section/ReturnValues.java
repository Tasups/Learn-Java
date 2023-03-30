public class ReturnValues {
    
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        printArea(2.3, 3.6, area1);
        // double area2 = calculateArea(30.5, 20.7);
        // double area3 = calculateArea(40.7, 22.5);
        
        String englishLanguage = explainArea("English");
        System.out.println(englishLanguage);
        // String frenchLanguage = explainArea("French");
        // String spanishLanguage = explainArea("Spanish");
        // String invalidLanguage = explainArea("Italian");
    }
    
    public static double calculateArea(double length, double width) {
        if (length <= 0 || width <=0) {
            System.out.println("Invalid dimensions.");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }
    
    public static String explainArea(String language) {
        
        switch (language) {
            case "English": return "Area equals length * width.";
            case "French": return "La surface est egale a la longueur * la largeur.";
            case "Spanish": return "area es igual a largo * ancho.";
            default: return "Language not available.";
        }
    }
    
    public static void printArea(double length, double width, double area) {
        System.out.println("The area of the object with the length of " + length + " and the width of " + width + " is " + area);
    }
    
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"