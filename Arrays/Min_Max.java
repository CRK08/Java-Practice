import java.util.*;
class Min_Max {
    public static void main(String[] args) {
        //Finds minimum and maximum element in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0], max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<min) min=a[i];
            if(a[i]>max) max=a[i];
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
}