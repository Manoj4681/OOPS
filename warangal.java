 import java.util.* ; 
public class warangal {
/*public static void odd_even(int n){
int bitmask = 1 ;
 if((n & bitmask) == 0 ){
	System.out.println("even") ;
}
else {
  
   System.out.println(" odd") ;
}
}
public static void main(String args[]) {

     odd_even(1) ;
     odd_even(45) ;
   odd_even(14) ;
  System.out.println((5&6));
}
} 
*/ 

    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("The lexicographically largest fruit is: " + largest);
    }
}
