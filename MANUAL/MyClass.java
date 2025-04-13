// question 2 
class MyClass {
    static int count = 0;
    final double PI = 3.14159;

    public MyClass() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println(" M.N.H.O.K . MANOJ ");
        System.out.println("CSE-C  CSE24214 ");

        // Creating objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        MyClass obj4 = new MyClass();

        System.out.println("-------------------------");

        System.out.println("Final value of count: " + count);
        System.out.println("Value of PI: " + obj1.PI);  
    }
}
