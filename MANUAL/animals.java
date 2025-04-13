// question 16
abstract class Animal {
   
    public abstract void eat();
}


class Herbivore extends Animal {
 public void eat() {
        System.out.println("Herbivore animal is deer");
    }
}


class Carnivore extends Animal {
  
    public void eat() {
        System.out.println("Carnivores animal is tiger.");
    }
}


class Omnivore extends Animal {

    public void eat() {
        System.out.println("Omnivore animal is bear.");
    }
}

public class animals {
    public static void main(String[] args) {
        System.out.println("Did by : M.N.H.O.K.MANOJ");
        System.out.println("CSE - C   CSE24214");
        System.out.println();


        Herbivore h = new Herbivore();
  
        Carnivore c = new Carnivore();
        Omnivore o = new Omnivore();
       
         h.eat(); 
         c.eat();
         o.eat();
         
    }
}
