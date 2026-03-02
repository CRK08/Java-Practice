// Demonstrates constructor overloading for circle area and circumference
class Circle {
    double r, ar, ci;
    double pi = 3.14;

    // Constructor with one parameter (radius)
    Circle(double r) {
        this.r = r;
        ar = pi * r * r;
        System.out.println("Area: " + ar);
    }

    // Constructor with two parameters (radius and pi)
    Circle(double r, double pi) {
        this.r = r;
        ci = 2 * pi * r;
        System.out.println("Circumference Circle: " + ci);
    }

    // Non-parameter constructor
    Circle() {
        System.out.println("Non-para");
    }
}

class CircleConstructor {
    public static void main(String[] args) {
        Circle ob = new Circle(5);
        Circle o = new Circle(5, 3.14);
        Circle obj = new Circle();
    }
}