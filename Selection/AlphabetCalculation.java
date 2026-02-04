import java.util.*;
class AlphabetCalculation {
    public static void main(String[] args) {
        // Perform arithmetic expressions based on alphabet input
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter an Alphabet (A to G): ");
        char ch = sc.next().toLowerCase().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println(0);
                break;
            case 'b':
                System.out.println(0 + 1 + 2 - 1);
                break;
            case 'c':
                System.out.println(5 - 2);
                break;
            case 'd':
                System.out.println(0 + 1 + 1 + 1);
                break;
            case 'e':
                System.out.println(0 + 1 + 3 + 1);
                break;
            case 'f':
                System.out.println(6 + 5 - 2 - 3);
                break;
            case 'g':
                System.out.println(5 + 3 - 1);
                break;
            default:
                System.err.println("Invalid Input");
        }
    }
}
