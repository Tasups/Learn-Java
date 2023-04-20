import shape.Cylinder;
import shape.Sphere;

public class Main {

    public static void main(String[] args) {
        
        // Cylinder params: double height, double radius
        Cylinder cylinder = new Cylinder(1.0, 2.0);
        // Sphere params: double radius
        Sphere sphere = new Sphere(1.0);

        System.out.println("Sphere - radius: " + sphere.getRadius());
        System.out.println("Cylinder - radius: " + cylinder.getRadius() + " height " + cylinder.getHeight());

    }

}
  