class vehicle{
String brand;
int speed;
int capacity;

 vehicle( String brand,int speed,int capacity){
this.brand = brand;
this.speed = speed ;
this.capacity = capacity ;
}

   public void displayinfo(String brand,int speed,int capacity){
System.out.println(" this are car details");
System.out.println("--------------------------------");
System.out.println(" ");
}
}
class main {
public static void main(String args[]){
vehicle bab = new vehicle();
bab.displayinfo("apple" , 75, 4);
}
}





