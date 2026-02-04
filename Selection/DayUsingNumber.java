import java.util.*;
class DayUsingNumber {
    public static void main(String[] args) {
        // Display day of the week using numeric input (1 to 7)
        Scanner ab = new Scanner(System.in);
        System.err.print("Enter a Sequence Number Represents the Days (1 to 7): ");
        int n = ab.nextInt();
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.err.println("Invalid Input");
        }
    }
}
