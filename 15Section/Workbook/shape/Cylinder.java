package shape;

import java.lang.Math.*;

public class Cylinder extends Shape {

    private double height;
    
    public Cylinder(double height, double radius) {
        super(radius);
        setHeight(height);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    // area = 2pi*(radius**2) + 2pi*radius*height
    @Override
    public double getArea() {
        double area = 2 * Math.PI * Math.pow(super.getRadius(), 2) + 2 * Math.PI * Math.pow(super.getRadius(), 2) * this.height;
        return area;
    }
    
    // volume = pi*(radius**2)*height
    @Override
    public double getVolume() {
        double volume = Math.PI * Math.pow(super.getRadius(), 2) * this.height;
        return volume;
    }

}