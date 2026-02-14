import java.util.*;
class Searching {
    public static void main(String[] args) {
        //Searches for an element in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int s=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(a[i]==s){
                System.out.println("Element found at index: "+i);
                found=true;
            }
        }
        if(!found) 
        System.out.println("Not found");
    }
}