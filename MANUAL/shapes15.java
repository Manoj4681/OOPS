// question 15
abstract class Shapes {

    public abstract double area();
}


class Triangle extends Shapes {
     double base;
     double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height;
    }
}


class Circle extends Shapes {
       double radius;

 
    public Circle(double radius) {
        this.radius = radius;
    }

   
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shapes {
     double length;
     double width;

  
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

  
    public double area() {
        return length * width;
    }
}

public class shapes15 {
    public static void main(String[] args) {

        System.out.println(" M.N.H.O.K . MANOJ ");
        System.out.println("CSE-C  CSE24214 ");

        Triangle t = new Triangle(2, 3);
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(3, 4);

        System.out.println("-------------------------");

        System.out.println("Area of Triangle: " + t.area());
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}
