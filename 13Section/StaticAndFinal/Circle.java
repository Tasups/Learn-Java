//import java.lang.Math.*;

// the above dot notation import lets us bring in every STATIC field in the java.lang.Math CLASS
// so we con't have to use the specific method operators for each function as seen below

import java.lang.Math;
// import java.lang.Math.max;
// import java.lang.Math.min;
// import java.lang.Math.pow;
// import java.lang.Math.sqrt;

// by using dot notation to add the actual method or constant, we no longer 
// need to use Math.PI or Math.pow, we can just use PI or pow, etc.
// this is similar to dot notation in objects and destructuring them in JavaScript

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getLargerRadius(double otherRadius) {
        return Math.max(radius, otherRadius);
    }

    public double getSmallerRadius(double otherRadius) {
        return Math.min(radius, otherRadius);
    }

    public double getRadiusSquared() {
        return Math.pow(radius, 2);
    }

    public double getRadiusSquareRoot() {
        return Math.sqrt(radius);
    }

}