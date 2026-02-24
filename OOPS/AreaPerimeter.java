// Demonstrates inheritance and method overriding
class Area {
    double r;
    public void get(int r) {
        this.r=r;
    }
    public void cal() {
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}

class Perimeter extends Area {
    double peri;
    public void cal() {
        peri = 2 * 3.14 * r;
        System.out.println(peri);
    }
}

class AreaPerimeter {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.get(2);
        obj.cal();
        obj = new Perimeter();
        obj.get(4);
        obj.cal();
    }
}