import java.util.*;
class Array_Display {
    public static void main(String[] args) {
        //Reads an array from user and prints elements
        Scanner ab = new Scanner(System.in);
        int n = ab.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=ab.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}