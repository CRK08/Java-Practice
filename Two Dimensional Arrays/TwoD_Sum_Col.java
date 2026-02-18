import java.util.*;
class TwoD_Sum_Col{
    public static void main(String[] args) {
        //Sum of each column in Two Dimensional Array Using Jagged Array
        Scanner ab = new Scanner(System.in);
        int r1,c1,sum;
        System.out.println("Enter Row Size:");
        r1 = ab.nextInt();
        int[][] a1=new int[r1][];
        for(int i=0;i<a1.length;i++){
            System.out.println("Enter Coulmn "+ (i+1)+" size");
            c1=ab.nextInt();
            System.out.println("Enter Elements:");
            a1[i]=new int[c1];
            for(int j=0;j<c1;j++){
                a1[i][j]=ab.nextInt();
            }
        }
        int maxC1=0;
        for(int i=0;i<r1;i++){
            if(a1[i].length>maxC1)
            maxC1=a1[i].length;
        }
        for(int i=0;i<maxC1;i++){
            sum=0;
            for(int j =0;j<r1;j++){
                if(i<a1[j].length)
                sum+=a1[j][i];
            }
            System.out.print(sum+" ");
        }
    }
}