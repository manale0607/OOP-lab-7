class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 4, w = 6;
        System.out.println("Area of Rectangle = " + (l * w));
    }
}

class Triangle extends Shape {
    void area() {
        int b = 5, h = 4;
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();

        s = new Triangle();
        s.area();
    }
}
