import java.util.*;
class TwoD_Max_Row{
    public static void main(String[] args){
        //Maximum Sum of Row in Two Dimensional Array Using Jagged Array
        Scanner ab = new Scanner(System.in);
        int r1,c1;
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
        int[] b =new int[r1];
        int sum;
        for(int i=0;i<r1;i++){
            sum=0;
            for(int j=0;j<a1[i].length;j++){
                sum+=a1[i][j];
            }
            b[i]=sum;
        }
        int max=b[0];
        for(int i=1;i<r1;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        System.out.println(max);
    }
}