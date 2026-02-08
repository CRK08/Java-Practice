import java.util.*;
class Prime_Number_Check {
    public static void main(String[] args) {
        // Check whether a number is prime
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to Check Prime:");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " is not a Prime Number");
            return;
        }
        int i = 2;
        boolean isPrime = true;
        while (i <= n / 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(n + " is a Prime Number"); 
        }else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}
