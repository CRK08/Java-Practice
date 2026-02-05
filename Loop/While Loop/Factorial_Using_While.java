import java.util.*;
class Factorial_Using_While {
    public static void main(String[] args) {
        // Find factorial of a number using while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Factorial:");
        int n = sc.nextInt();
        int fact = 1, i = 1;
        if (n == 0) {
            System.out.println(1);
        } else {
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
