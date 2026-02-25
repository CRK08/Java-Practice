// Demonstrates abstract class and method implementation
abstract class Shape {
    double area;
    abstract public void cal();
}

class CircleShape extends Shape {
    int r;
    CircleShape(int r) {
        this.r = r;
    }
    public void cal() {
        area = 3.14 * r * r;
        System.out.println("Area = " + area);
    }
}

class AbstractShapeDemo {
    public static void main(String[] args) {
        CircleShape o = new CircleShape(5);
        o.cal();
    }
}