import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        // Car nissan = new Car("Nissan", 25_000, 2022, "silver");
        // Car nissan2 = new Car(nissan);
        // Car dodge = new Car("Dodge", 35_000, 2021, "black");
        // nissan.drive();
        
        
        // String[] newPassport = new String[]{"Jason Whisnant", "Paraguan", "08/24/1977"};
       
        
        Person jason = new Person("Jason Whisnant", "Paraguan", "08/24/1977", 1);
        
        System.out.println("Name: " + jason.getName());
        System.out.println("Nationality: " + jason.getNationality());
        System.out.println("Date of Birth: " + jason.getDateOfBirth());
        System.out.println("Seat Number: " + jason.getSeatNumber());
        
        boolean passport = jason.applyPassport();
        if(passport) {
            System.out.println("Congratulations, " + jason.getName() + ". Your passport was approved!");
            System.out.println("I'm sorry, your seat was taken, we will have to assign you another...");
            int seatChoice = jason.chooseSeat();
            System.out.println("We were able to secure another seat for you. You will be seated at seat: " + seatChoice + ". We hope you have a safe flight.");
        } else {
            System.out.println("We are sorry " + jason.getName() + ". We cannot process your application.");
        }
        
        
        // Person twin = new Person(jason);
        
        // twin.setName("Josh Whisnant");
        // twin.setSeatNumber(14);
        
        // jason.setSeatNumber(10);
        
        
        // System.out.println(" ");
        // System.out.println("Name: " + twin.getName());
        // System.out.println("Nationality: " + twin.getNationality());
        // System.out.println("Date of Birth: " + twin.getDateOfBirth());
        // System.out.println("Seat Number: " + twin.getSeatNumber());
        
        
        // System.out.println("I am " + jason.getName() + ". I am a " + jason.getNationality() + " born in " + jason.getDateOfBirth() + ". Please let me sit in seat number: " + jason.getSeatNumber() + ".");
        // System.out.println("I am " + twin.getName() + ". I am a " + twin.getNationality() + " born in " + twin.getDateOfBirth() + ". Please let me sit in seat number: " + twin.getSeatNumber() + ".");
    }
    
}