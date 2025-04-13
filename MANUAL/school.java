// Quuestion 18 
abstract class Shape3D {

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();
}


class Sphere extends Shape3D {
    private double radius;

   
    public Sphere(double radius) {
        this.radius = radius;
    }


    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }


    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}


class Cube extends Shape3D {
   
    private double side;


    public Cube(double side) {
        this.side = side;
    }


    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    public double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}


public class school {
    public static void main(String[] args) {
        System.out.println(" M.N.H.O.K . MANOJ ");
        System.out.println("CSE-C  CSE24214 ");

        Shape3D sphere = new Sphere(5);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

     
        Shape3D cube = new Cube(4);
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
    }
}
