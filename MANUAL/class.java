class university{
    string name ;
    int percentile ;
   university(String name , int percentile){
     this.name = name ;
     this.percentile = percentile ;
  public void office(){
System.out.println(" admissions criteria is mension bellow");
}
}
class pg extends university {
   pg( String name int percentile){
    this.name = name;
    this. Percentile = percentile ;
}
  public void office( String name ,int percentile){
   if( percentile >= 60){
  System.out.println(name+ " elgible for admission " );
  else {
   System.out.println(name+ "  not elgible for admission " );

   }
}
}
 class ug extends university {
    ug(String name int percentile ){
    
