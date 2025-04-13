// question 6 
import java.util.Scanner;

public class comparing {
 System.out.println("did by: M.N.H.O.K.MANOJ  from cse-c roll no : cse24214");
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double num2 = scanner.nextDouble();

               if (num1 == num2) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }

     
    }
}
