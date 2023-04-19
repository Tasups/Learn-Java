package model;
import java.util.List;
import java.util.ArrayList;

public class CarDealership {
    
    private ArrayList<Car> cars; 
    
    public CarDealership() {
        this.cars = new ArrayList<>();
    }
    
    public Car getCar(int index) {
        Car carCopy = new Car(this.cars.get(index));
        return carCopy;
    }
    
    public void setCar(int index, Car newCar) {
        Car carCopy = new Car(newCar);
        this.cars.set(index, carCopy);
    }
    
    public void addCar(Car newCar) {
        Car carCopy = new Car(newCar);
        this.cars.add(carCopy);
    }
    
}