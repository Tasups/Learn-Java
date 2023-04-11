import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership dealership = new Dealership(cars);
        
        
     
        // String[] spareParts = {"Tires", "Keys"};
     
        // Car nissan = new Car("Nissan", 25_000, 2022, "silver", spareParts);
        // Car dodge = new Car("Dodge", 35_000, 2021, "black", spareParts);
        // Car nissan2 = new Car(nissan);
        
        // System.out.println(dodge);
        // System.out.println(nissan);
        // System.out.println(nissan2);
        
        
        
        
        // String[] newPassport = new String[]{"Jason Whisnant", "Paraguan", "08/24/1977"};
       
        // Person jason = new Person("Jason Whisnant", "Ashevillean", "08/24/1977", 17);
        
        // System.out.println("Name: " + jason.getName());
        // System.out.println("Nationality: " + jason.getNationality());
        // System.out.println("Date of Birth: " + jason.getDateOfBirth());
        // System.out.println("Seat Number: " + jason.getSeatNumber());
        
        // boolean passport = jason.applyPassport();
        // if(passport) {
        //     jason.setPassport();
        //     System.out.println("Congratulations, " + jason.getName() + ". Your passport was approved!");
        //     System.out.println("Passport: " + Arrays.toString(jason.getPassport()));
        //     System.out.println("I'm sorry, your seat was taken, we will have to assign you another...");
        //     int seatChoice = jason.chooseSeat();
        //     System.out.println("We were able to secure another seat for you. You will be seated at seat: " + seatChoice + ". We hope you have a safe flight.");
        // } else {
        //     System.out.println("We are sorry " + jason.getName() + ". We cannot process your application.");
        // }
        
        // System.out.println(jason);
        
        
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