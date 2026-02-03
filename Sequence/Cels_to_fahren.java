import java.util.Scanner;
public class Cels_to_fahren {
    public static void main(String[] args) {
        // Converts Celsius to Fahrenheit
        Scanner ab = new Scanner(System.in);
        float cel;
        System.out.print("Enter Celsius: ");
        cel = ab.nextFloat();
        System.out.println("Fahrenheit = " + cel * 1.8 + 32);
    }
}