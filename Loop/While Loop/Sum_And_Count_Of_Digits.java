import java.util.*;
class Sum_And_Count_Of_Digits {
    public static void main(String[] args) {
        // Calculate sum and count of digits using while loop
        Scanner sc = new Scanner(System.in);  
        int digit, count = 0, sum = 0;
        System.out.println("Enter digit:");
        int n = sc.nextInt();
        while (n != 0) {
            digit = n % 10;
            sum += digit; // Sum of digits
            n = n / 10;
            count++; // Count of digits
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
