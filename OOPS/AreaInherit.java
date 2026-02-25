// Demonstrates inheritance with Circle, Rectangle, and Square
class Circle {
    int r;
    Circle(int r) {   // constructor
        this.r = r;
    }
    void area() {
        System.out.println("Circle Area: " + 3.14 * r * r);
    }
}

class Rectangle extends Circle {
    int l, b;
    Rectangle(int l, int b) {
        super(0); // parent Circle constructor called
        this.l = l;
        this.b = b;
    }
    void area() {
        System.out.println("Rectangle Area: " + l * b);
    }
}

class Square extends Rectangle {
    int side;
    Square(int side) {
        super(side, side); // parent Rectangle constructor called
        this.side = side;
    }
    void area() {
        System.out.println("Square Area: " + side * side);
    }
}

class AreaInherit {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Square s = new Square(4);
        c.area();
        r.area();
        s.area();
    }
}