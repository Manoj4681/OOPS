abstract class Shape3D {
    abstract double calculateVolume();
    abstract double surfaceArea();
}

class Sphere extends Shape3D {
    int r;

    public Sphere(int r) {
        this.r = r;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }
}

class Cube extends Shape3D {
    int a;

    public Cube(int a) {
        this.a = a;
    }

    public double calculateVolume() {
        return Math.pow(a, 3);
    }

    public double surfaceArea() {
        return 6 * Math.pow(a, 2);
    }
}

 class mannu {
    public static void main(String[] args) {
        System.out.println("did by: M.N.H.O.K.MANOJ  from cse-c roll no : cse24214");
        Sphere obj = new Sphere(6);
        Cube obj1 = new Cube(8);

        System.out.println("Sphere Volume: " + obj.calculateVolume());
        System.out.println("Sphere Surface Area: " + obj.surfaceArea());

        System.out.println("Cube Volume: " + obj1.calculateVolume());
        System.out.println("Cube Surface Area: " + obj1.surfaceArea());
    }
}

