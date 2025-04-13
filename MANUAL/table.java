import java.util.Scanner;
// question 5 
public class MultiplicationTable {
    public static void main(String[] args) {
  
    System.out.println(" M.N.H.O.K . MANOJ ");
        System.out.println("CSE-C  CSE24214 ");
    
  Scanner scanner = new Scanner(System.in);


        System.out.print("Input the number (Table to be calculated): ");
        int number = scanner.nextInt();

  
        System.out.print("Input number of terms: ");
        int terms = scanner.nextInt();


        for (int i = 0; i <= terms; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }


        scanner.close();
    }
}
