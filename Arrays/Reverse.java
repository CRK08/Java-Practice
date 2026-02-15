import java.util.*;
class Reverse {
    public static void main(String[] args) {
        //Prints array in reverse order
        Scanner ab = new Scanner(System.in);
        int n = ab.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=ab.nextInt();
        }
        System.out.println("Reverse:");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}