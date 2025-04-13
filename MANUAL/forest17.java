// QUESTION 17 
abstract class Animal {

    public abstract void sound();
}

class Lion extends Animal {

    public void sound() {
        System.out.println("amba amba...............");
    }
}


class Tiger extends Animal {

    public void sound() {
        System.out.println("meow  meow ");
    }
}


public class forest17 {
    public static void main(String[] args) {
       System.out.println(" M.N.H.O.K . MANOJ " );
         System.out.println(" CSE- C  CSE24214 ");
         Lion  l = new Lion();
         Tiger t  = new Tiger();
        
       
        l.sound();  
        t.sound();
    }
}
