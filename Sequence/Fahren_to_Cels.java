// Converts Fahrenheit to Celsius
import java.util.Scanner;

public class Fahren_to_Cels {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        float fare;
        System.out.print("Enter Fahrenheit: ");
        fare = ab.nextFloat();
        System.out.println("Celsius = " + (fare - 32) * 5 / 9);
    }
}