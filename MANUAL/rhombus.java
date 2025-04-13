import java.util.Scanner;
// question 10
public class rhombus {
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


        System.out.print("Input the number: ");
        int n = scanner.nextInt();

     
        scanner.close();

 
        for (int i = 1; i <= n; i++) {
         
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }


            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

       
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

 
            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {
       
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }


            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

     
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }


            System.out.println();
        }
    }
}

