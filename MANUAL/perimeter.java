interface Shape {
    void getPerimeter();
}

class Rectangle implements Shape {
    int l, b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void getPerimeter() {
        int perimeter = 2 * (l + b);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Triangle implements Shape {
    int s1, s2, s3;

    public Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void getPerimeter() {
        int perimeter = s1 + s2 + s3;
        System.out.println("Triangle Perimeter: " + perimeter);
    }
}

class Circle implements Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public void getPerimeter() {
        double perimeter = 2 * Math.PI * r;
        System.out.println("Circle Perimeter: " + perimeter);
    }
}

 class perimeter {
    public static void main(String[] args) {
        System.out.println("Done by M.N.H.O.K MANOJ FROM CSE C CSE24214");

        Shape obj1 = new Rectangle(4, 6);
        Shape obj2 = new Triangle(4, 6, 5);
        Shape obj3 = new Circle(3);

        obj1.getPerimeter();
        obj2.getPerimeter();
        obj3.getPerimeter();
    }
}