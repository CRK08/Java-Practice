import java.util.*;
class Long_Sub_Sum {
    public static void main(String[] args) {
        //Finds longest contiguous subarray whose sum equals given number
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = ab.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            arr[i] = ab.nextInt();
        }
        System.out.println("Enter Number to Sum:");
        int target = ab.nextInt();
        int longest = 0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum >= target){
                    if(sum == target){
                        int len = j-i+1;
                        if(len > longest) longest = len;
                    }
                    break;
                }
            }
        }
        System.out.println("Longest Subarray Length: "+longest);
    }
}