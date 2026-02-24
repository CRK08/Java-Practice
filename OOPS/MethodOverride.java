// Demonstrates method overriding with inheritance
import java.util.*;

class A {
    int a;
    A() {
        a = 0;
    }
    public void get(int a) {
        Scanner ab = new Scanner(System.in);
        a = ab.nextInt();
        System.out.println("A " + a);
    }
}

class MethodOverride extends A {
    int b;
    MethodOverride() {
        super();
        b = 0;
    }
    public void get() {
        Scanner ab = new Scanner(System.in);
        b = ab.nextInt();
    }

    public static void main(String[] args) {
        MethodOverride ob = new MethodOverride();
        ob.get(10);
        ob.get();
    }
}