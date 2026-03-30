import java.util.* ;
public class Bankers {
 public static void main(String args[]){
     int n = 3 , m=3;
     int alloc[][] = { {1,3,2},{2,1,2},{2,4,3}};
     int max[][] = {{3,3,3} , {4,3,3}, {3,2,5} } ;
     int need[][] = new int[n][m];
     int avail[] = {1,3,2};
     
     for(int i = 0 ; i<n;i++){
       
       for(int j = 0 ; j<m;j++){
      
           need[i][j] = max[i][j] - alloc[i][j] ;
     }
  }
 
  
  Boolean finish[] = new Boolean[n];
  int safe[] = new int[n] ; 
   int k = 0 ;
    for(int count = 0 ; count < n ; count++) {
     
      for( int i = 0 ; i<n;i++){
       
         if(!finish[i]){
    
            int j ;

         for(j = 0; j<m; j++){
        
              if(need[i][j] > avail[j]){
    
                 break ; 
              }
        }

       if(j == m ) {

        System.out.println("process" + i + "" + "excuted") ;
       
         for(int x = 0 ; x<m;x++){
  
            avail[x] = avail[x] + alloc[i][x] ; 
         }



       safe[k++] = i;
       finish[i]= true ;

    }
  }
}
}
for(int i = 0 ; i<n;i++){
  System.out.println("safe sequence :" + safe[i] );
}
}
}
  
  
