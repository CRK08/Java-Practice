import java.util.*;
class Fibonacci {
    public static void main(String[] args) {
        //Generates Fibonacci series up to given length
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Series Length:");
        int n = ab.nextInt();
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2;i<n;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Fibonacci Series for "+n+" terms:");
        for(int i=0;i<n;i++){
            System.out.print(fib[i]+" ");
        }
    }
}