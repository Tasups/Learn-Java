package shape;

import java.lang.Math.*;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }
    
    @Override
    // area = 4 * PI * (r**2)
    public double getArea() {
        double area = 4 * Math.PI * Math.pow(super.getRadius(), 2);
        return area;
    }
    
    @Override
    // volume = 4/3 * PI * (r**3),
    public double getVolume() {
        double volume = 4 / 3 * Math.PI * Math.pow(super.getRadius(), 3);
        return volume;
    }

}