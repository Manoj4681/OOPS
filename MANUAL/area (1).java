// question 20 
interface Shape {
   double getPerimeter();
}

class Rectangle implements Shape {
   double length;
    double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

  
    public double getPerimeter() {
        return 2 * (length + width);
    }
}


class Circle implements Shape {
    double radius;

  
    public Circle(double radius) {
        this.radius = radius;
    }

   
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}


class Triangle implements Shape {
   double s1;
   double s2;
   double s3;

   
    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }


    public double getPerimeter() {
        return s1 + s2 + s3;
    }
}


public class 	area {
    public static void main(String[] args) {
        System.out.println("Did by : M.N.H.O.K.MANOJ");
        System.out.println("CSE - C   CSE24214");
        System.out.println();

    
        Shape rectangle = new Rectangle(5.0, 3.0);
        Shape circle = new Circle(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);


         System.out.println("perimeter of rectangle:");
         System.out.println( rectangle.getPerimeter());
          System.out.println();
          System.out.println("perimeter of circle:");
         System.out.println( circle.getPerimeter());
         System.out.println();
         System.out.println("perimeter of triangle:");
         System.out.println( triangle.getPerimeter());
    }
}
