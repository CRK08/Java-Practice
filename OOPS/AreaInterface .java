// Demonstrates area of circle using interface
interface CircleInterface {
    double PI = 3.14;
    void cal();
}

class Area implements CircleInterface {
    double r, area;
    Area(double r) {
        this.r = r;
    }
    public void cal() {
        area = PI * r * r;
        System.out.println("Area: " + area);
    }
}

class AreaInterface {
    public static void main(String[] args) {
        Area obj = new Area(10);
        obj.cal();
    }
}