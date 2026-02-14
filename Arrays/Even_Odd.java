import java.util.*;
class Even_Odd {
    public static void main(String[] args) {
        //Counts even and odd numbers in array
        Scanner ab = new Scanner(System.in);
        int n = ab.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=ab.nextInt();
        }
        int even=0, odd=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Even Numbers: "+even);
        System.out.println("Odd Numbers: "+odd);
    }
}