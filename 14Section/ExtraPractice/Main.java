import java.util.Scanner;

import model.Car;
import model.CarDealership;
import static model.Car.*;


public class Main {
    
    public static void main(String[] args) {
        
        /* PART 1 TESTS **************************************************************/
        // Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);
        // System.out.println(car1.getMake());
        // System.out.println(car1.toString());
    
        // Uncomment the following line to test invalid input for setMake method
        // car1.setMake("");
    
        // Uncomment the following line to test invalid input for setModel method
        // car1.setModel("");
    
        // Uncomment the following line to test invalid input for setBodyType method
        // car1.setBodyType(null);
    
        // Uncomment the following line to test invalid input for setProductionYear method
        // car1.setProductionYear(1899);
    
        // Uncomment the following line to test invalid input for setPrice method
        // car1.setPrice(-1);
    
        // Uncomment the following line to test invalid input for setPrice method
        // car1.setPrice(200001);
    
        // Uncomment the following line to test invalid input for the constructor
        // Car car2 = new Car("", "Camry", SEDAN, 2020, 30000);
        
        /* PART 2 TESTS **************************************************************/
        // Car car1 = new Car("Toyota", "Camry", BodyType.SEDAN, 2020, 30000);
        // Car car2 = new Car("Honda", "Civic", BodyType.SEDAN, 2021, 25000);
    
        // CarDealership dealership = new CarDealership();
        
        // // Test the addCar method
        // dealership.addCar(car1);
        // dealership.addCar(car2);
    
        // // Test the getCar method
        // Car retrievedCar = dealership.getCar(0);
        // System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());
    
        // // Test the setCar method
        // Car newCar = new Car("Ford", "Mustang", BodyType.COUPE, 2022, 45000);
        // dealership.setCar(0, newCar);
    
        // // Verify that the car was updated
        // retrievedCar = dealership.getCar(0);
        // System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());
        
        /* PART 3 TESTS **************************************************************/
        
        Scanner scanner = new Scanner(System.in);

        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);
    
        Car newCar = new Car(make, model, bodyType, year, price);
    
        CarDealership dealership = new CarDealership();
        dealership.addCar(newCar);
    
        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());
        
        // scanner.close();
    }
    
    public static boolean isNullOrBlank(String input) {
        return (input == null || input.isBlank());
    }
    
    public static boolean invalidYear(int year) {
        return (year < Car.MIN_YEAR);
    }
    
    public static boolean invalidPrice(double price) {
        return (price <= Car.MIN_PRICE || price > Car.MAX_PRICE);
    }
    
    public static boolean invalidBodyType(String bodyType) {
        try {
            BodyType.valueOf(bodyType.toUpperCase());
            return false;
        } catch(IllegalArgumentException exception) {
            System.out.println("\nValid body types are sedan, coupe, hatchback, suv, truck, van.");
            return true;
        }
    }
    
    public static BodyType promptForBodyType(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid body type: ");
            String bodyType = scanner.nextLine();
            if (!invalidBodyType(bodyType)) {
                return BodyType.valueOf(bodyType.toUpperCase());
            }
        }
    }
    
    public static String promptForMake(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();
            if (!isNullOrBlank(make)) {
                return make;
            }
        }
    }
    
    public static String promptForModel(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valie car model: ");
            String model = scanner.nextLine();
            if (!isNullOrBlank(model)) return model;
        }
    }
    
    public static int promptForYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid production year: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int year = scanner.nextInt();
            if (!invalidYear(year)) return year;
        }
    }
    
    public static double promptForPrice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car price: ");
            if (!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            }
            double price = scanner.nextDouble();
            if (!invalidPrice(price)) return price;
        }
    }
    
}