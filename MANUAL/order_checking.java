import java.util.Scanner;

         public class order_checking {

        public static void main(String[] args) {
   
   System.out.println(" M.N.H.O.K . MANOJ ");
        System.out.println("CSE-C  CSE24214 ");

        Scanner scanner = new Scanner(System.in);


        System.out.print("enter first number: ");

        int num1 = scanner.nextInt();

        System.out.print("enter second number: ");

        int num2 = scanner.nextInt();

        System.out.print("enter third number: ");

        int num3 = scanner.nextInt();

    
        if (num1 < num2 && num2 < num3) {

            System.out.println("Increasing order");

        } else if (num1 > num2 && num2 > num3) {

            System.out.println("Decreasing order");

        } else {

            System.out.println(" not in neigjhter two cases");
        }

  

    }
}
