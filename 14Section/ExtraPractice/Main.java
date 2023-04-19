import model.Car;
import model.CarDealership;
import static model.Car.BodyType.*;


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
        Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);
        Car car2 = new Car("Honda", "Civic", SEDAN, 2021, 25000);
    
        CarDealership dealership = new CarDealership();
        
        // Test the addCar method
        dealership.addCar(car1);
        dealership.addCar(car2);
    
        // Test the getCar method
        Car retrievedCar = dealership.getCar(0);
        System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());
    
        // Test the setCar method
        Car newCar = new Car("Ford", "Mustang", COUPE, 2022, 45000);
        dealership.setCar(0, newCar);
    
        // Verify that the car was updated
        retrievedCar = dealership.getCar(0);
        System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());
        
    }
    
}