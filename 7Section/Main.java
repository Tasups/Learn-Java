import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        Car toyota = new Car("Toyota", 25_000, 2022, "silver");
        Car honda = new Car("Honda", 35_000, 2021, "black");
        
        toyota.setColor("Jet Black");
        toyota.setPrice(1000);
        toyota.setYear(2001);
        toyota.setMake("Nissan");
        
        
        System.out.println("This " + toyota.getMake() + " is worth $" + toyota.getPrice() + 
        ". It was built in " + toyota.getYear() + ". It is " + toyota.getColor() + ".\n");
        System.out.println("This " + honda.getMake() + " is worth $" + honda.getPrice() + 
        ". It was built in " + honda.getYear() + ". It is " + honda.getColor() + ".\n");
        
        // Person jason = new Person();
        // jason.name = "Jason Whisnant";
        // jason.nationality = "United States of America";
        // jason.dateOfBirth = "08/24/1977";
        // jason.passport = new String[]{jason.name, jason.nationality, jason.dateOfBirth};
        // jason.seatNumber = 17;
        
        // System.out.println(jason.name);
        // System.out.println(jason.nationality);
        // System.out.println(Arrays.toString(jason.passport));
        // System.out.println(jason.dateOfBirth);
        // System.out.println(jason.seatNumber);
        
        Dude jason = new Dude("Jason Whisnant", "Paraguan", "08/24/1977", 1);
        
        // System.out.println("I am " + jason.name + ". I am a " + jason.nationality + " born in " + jason.dateOfBirth + ". Please let me sit in seat number: " + jason.seatNumber);
    }
    
}