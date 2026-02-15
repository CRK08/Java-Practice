import java.util.*;
class Sorting {
    public static void main(String[] args) {
        //Sorts array in ascending and descending order
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // Ascending
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i]; a[i]=a[j]; a[j]=temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
        // Descending
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    int temp=a[i]; a[i]=a[j]; a[j]=temp;
                }
            }
        }
        System.out.println("\nDescending Order:");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}