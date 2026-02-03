import java.util.Scanner;
public class Area_of_Circle {
    public static void main(String[] args) {
        // Calculates area of circle using radius input
        Scanner ab = new Scanner(System.in);
        double l;
        System.out.print("Enter Radius: ");
        l = ab.nextDouble();
        System.out.println("Area of Circle = " + l * 3.14 * 2);
    }
}