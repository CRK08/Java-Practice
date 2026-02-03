import java.util.Scanner;
public class Perimeter_of_Triangle {
    public static void main(String[] args) {
        // Calculates perimeter of a triangle
        Scanner ab = new Scanner(System.in);
        float m, n, o;
        System.out.print("Enter the Values of A, B, C: ");
        m = ab.nextFloat();
        n = ab.nextFloat();
        o = ab.nextFloat();
        System.out.println("Perimeter of Triangle = " + (m + n + o));
    }
}