import java.util.*;
class Armstrong_Number {
    public static void main(String[] args) {
        // Check whether a number is an Armstrong number using while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int temp = num, digits = 0;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong Number"); 
        }else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}
