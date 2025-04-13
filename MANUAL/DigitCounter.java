// question 8 
import java.util.Scanner;

public class digitcounter {
    public static void main(String[] args) {
 
      System.out.println(" M.N.H.O.K . MANOJ ");
        System.out.println("CSE-C  CSE24214 ");

       
        Scanner scanner = new Scanner(System.in);

                System.out.print("Input an integer number less than ten billion: ");
        long number = scanner.nextLong();

               if (number >= 0 && number < 10000000000L) {
                        int digitCount = 0;

                        while (number > 0) {
                number /= 10;  
                digitCount++;   
            }

                       if (digitCount == 0) {
                digitCount = 1;
            }

                        System.out.println("Number of digits in the number: " + digitCount);
        } else {
            System.out.println("Invalid input The number should be less than ten billion.");
        }

              
    }
}
