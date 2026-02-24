// Demonstrates encapsulation using getters and setters
class Add {
    private int a, b, c;
    public void setta(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int get_a() { return a; }
    public int get_b() { return b; }
    public void disp() {
        c = a + b;
        System.out.println(c);
    }
}

class AddSum {
    public static void main(String[] args) {
        Add obj = new Add();
        obj.setta(5,10);
        System.out.println("a = " + obj.get_a());
        System.out.println("b = " + obj.get_b());
        obj.disp();
    }
}