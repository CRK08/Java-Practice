// Demonstrates inheritance and accessing parent class variables
import java.util.*;

class A {
    int a, b;
    public void getdata() {
        Scanner ab = new Scanner(System.in);
        a = ab.nextInt();
        b = ab.nextInt();
    }
}

class InheritConcept extends A {
    int c;
    public void calculate() {
        c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        InheritConcept obj = new InheritConcept();
        obj.getdata();
        obj.calculate();
    }
}