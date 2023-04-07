import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        // Car nissan = new Car("Nissan", 25_000, 2022, "silver");
        
        // Car nissan2 = new Car(nissan);

        // nissan2.setColor("Yellow");
        // nissan.setColor("Orange");
        // nissan2.setColor("Blue");
        // nissan.setColor("Purple");
        // nissan2.setColor("Fuchsia");
        // nissan.setColor("Beige");  
        
        // Car dodge = new Car("Dodge", 35_000, 2021, "black");
        
        
        // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        // ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        // System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() + 
        // ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");
        // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        // ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
        
        
        String[] newPassport = new String[]{"Jason Whisnant", "Paraguan", "08/24/1977"};
       
        
        Person jason = new Person("Jason Whisnant", "Paraguan", "08/24/1977", newPassport, 1);
        Person twin = new Person(jason);
        
        twin.setName("Josh Whisnant");
        twin.setSeatNumber(14);
        
        jason.setSeatNumber(10);
        
        System.out.println("Name: " + jason.getName());
        System.out.println("Nationality: " + jason.getNationality());
        System.out.println("Date of Birth: " + jason.getDateOfBirth());
        System.out.println("Seat Number: " + jason.getSeatNumber());
        System.out.println(" ");
        System.out.println("Name: " + twin.getName());
        System.out.println("Nationality: " + twin.getNationality());
        System.out.println("Date of Birth: " + twin.getDateOfBirth());
        System.out.println("Seat Number: " + twin.getSeatNumber());
        
        
        // System.out.println("I am " + jason.getName() + ". I am a " + jason.getNationality() + " born in " + jason.getDateOfBirth() + ". Please let me sit in seat number: " + jason.getSeatNumber() + ".");
        // System.out.println("I am " + twin.getName() + ". I am a " + twin.getNationality() + " born in " + twin.getDateOfBirth() + ". Please let me sit in seat number: " + twin.getSeatNumber() + ".");
    }
    
}