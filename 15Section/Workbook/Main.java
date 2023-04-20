import shape.Cylinder;
import shape.Sphere;
import shape.Shape;

public class Main {

    public static void main(String[] args) {
        
        // Cylinder params: double height, double radius
        Cylinder cylinder = new Cylinder(1.0, 2.0);
        // Sphere params: double radius
        Sphere sphere = new Sphere(1.0);
        
        printMeasures(cylinder);
        printMeasures(sphere);

        System.out.println("Sphere - radius: " + sphere.getRadius());
        System.out.println("Cylinder - radius: " + cylinder.getRadius() + " height " + cylinder.getHeight());

    }
    
    public static void printMeasures(Shape shape) {
        System.out.println("\n" + shape.getClass().getSimpleName());

        double area = shape.getArea();
        double volume = shape.getVolume();
        
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }


}
  