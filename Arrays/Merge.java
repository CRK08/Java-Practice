import java.util.*;
class Merge {
    public static void main(String[] args) {
        //Merges two arrays
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter First Array:");
        int n=ab.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=ab.nextInt();
        }
        System.out.println("Enter Second Array:");
        int m=ab.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=ab.nextInt();
        }
        int[] mer=new int[n+m];
        for(int i=0;i<n;i++){
            mer[i]=a[i];
        }
        for(int i=0;i<m;i++){
            mer[n+i]=b[i];
        }
        System.out.println("Merged Array:");
        for(int i=0;i<mer.length;i++) System.out.print(mer[i]+" ");
    }
}