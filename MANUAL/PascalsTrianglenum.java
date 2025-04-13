// questrion 9 
import java.util.Scanner;

public class PascalsTrianglenum {
    public static void main(String[] args) { 


 System.out.println(" M.N.H.O.K . MANOJ ");
        System.out.println("CSE-C  CSE24214 ");


               Scanner scanner = new Scanner(System.in);

       
        System.out.print("Input number of rows: ");
        int numRows = scanner.nextInt();

       
        scanner.close();

               for (int row = 0; row < numRows; row++) {
               for (int space = 0; space < numRows - row - 1; space++) {
                System.out.print(" ");
            }

                       int value = 1;  
                for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");
                value = value * (row - col) / (col + 1);  
            }

                       System.out.println();
        }
    }
}
