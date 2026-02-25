// Demonstrates area of circle using class and methods
import java.util.*;

class Circle {
    private double r, area;
    protected void getData() {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter r:");
        r = ab.nextDouble();
    }
    public void calc() {
        area = 3.14 * r * r;
        System.out.println("Area: " + area);
    }
}

class AreaOfCircle {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.getData();
        obj.calc();
    }
}