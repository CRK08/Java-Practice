import java.util.*;
class Dup_Unique {
    public static void main(String[] args) {
        //Finds duplicates and prints unique elements
        Scanner ab = new Scanner(System.in);
        int n = ab.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=ab.nextInt();
        }
        // Duplicate count
        int dupCount=0;
        boolean[] v=new boolean[n];
        for(int i=0;i<n;i++){
            if(v[i]) continue;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    dupCount++;
                    v[i]=true;
                }
            }
        }
        if(dupCount>0) System.out.println("Duplicates: "+dupCount);
        else System.out.println("No duplicate");
        // Unique elements
        System.out.println("Unique Elements:");
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]) c++;
            }
            if(c==0) System.out.print(a[i]+" ");
        }
    }
}