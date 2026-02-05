public class Logical_Operators {
    public static void main(String[] args) {
        // Demonstrates logical operators (AND, OR, |)
        boolean a, b, c;
        a = (5 < 3) || (3 > 4);   // OR operator
        b = (5 < 3) && (3 > 5);   // AND operator
        c = (5 > 3) | (5 > 9);    // Bitwise OR used as logical
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}