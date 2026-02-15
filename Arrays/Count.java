import java.util.*;
class Count {
    public static void main(String[] args) {
        //Counts occurrences of each element
        Scanner ab = new Scanner(System.in);
        int n=ab.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=ab.nextInt();
        int[] visited=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==1) continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    visited[j]=1;
                }
            }
            System.out.println(a[i]+" occurs "+count+" times");
        }
    }
}