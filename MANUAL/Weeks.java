import java.util.Scanner;
// question 4 
public class Weeks {
    public static void main(String[] args) {
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

        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Input number: ");
        int day = scanner.nextInt();

       
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day== 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
           
            System.out.println("Invalid number. Please enter a number between 1 and 7.");
        }

        
        scanner.close();
    }
}
