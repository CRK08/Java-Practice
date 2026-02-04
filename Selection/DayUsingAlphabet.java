import java.util.*;
class DayUsingAlphabet {
    public static void main(String[] args) {
        // Display day of the week using alphabet input (A to G)
        Scanner ab = new Scanner(System.in);
        System.err.print("Enter an Alphabet Represents the Days (A to G): ");
        char ch = ab.next().toLowerCase().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("Sunday");
                break;
            case 'b':
                System.out.println("Monday");
                break;
            case 'c':
                System.out.println("Tuesday");
                break;
            case 'd':
                System.out.println("Wednesday");
                break;
            case 'e':
                System.out.println("Thursday");
                break;
            case 'f':
                System.out.println("Friday");
                break;
            case 'g':
                System.out.println("Saturday");
                break;
            default:
                System.err.println("Invalid Input");
        }
    }
}
