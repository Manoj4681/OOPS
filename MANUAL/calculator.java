// QUESTION NUMBER 13

class Addition {
    public int add(int a, int b) {
        System.out.println("Addition is done in calculator below:");
        System.out.println("");
        int addition = a + b;
        return addition;
    }
}

class Subtraction extends Addition {
    public int sub(int a, int b) {
        System.out.println("Subtraction is done in calculator below:");
        System.out.println("");
        int subtraction = a - b;
        return subtraction;
    }
}

class Multiplication extends Subtraction {
    public int mult(int a, int b) {
        System.out.println("Multiplication is done in calculator below:");
        System.out.println("");
        int multiplication = a * b;
        return multiplication;
    }
}

class Division extends Multiplication {
    public int div(int a, int b) {
        System.out.println("Division is done in calculator below:");
        System.out.println("");
        int division = a / b;
        return division;
    }
}

 class Calculator {
    public static void main(String args[]) {
        System.out.println("Did by : M.N.H.O.K.MANOJ");
        System.out.println("CSE - C   CSE24214");
        System.out.println();

        Division obj = new Division();

        System.out.println("Addition is: " + obj.add(99, 1));
        System.out.println("-----------------------------------");
        System.out.println("Subtraction is: " + obj.sub(200, 100));
        System.out.println("-----------------------------------");
        System.out.println("Multiplication is: " + obj.mult(50, 2));
        System.out.println("-----------------------------------");
        System.out.println("Division is: " + obj.div(1000, 10));
        System.out.println("**************************************");
    }
}
