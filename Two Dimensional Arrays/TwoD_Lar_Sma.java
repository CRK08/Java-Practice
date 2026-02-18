import java.util.*;
class TwoD_Lar_Sma{
    public static void main(String[] args) {
        //Smallest and Largest Element in Two Dimensional Array Using Jagged Array
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
        int min=a1[0][0];
        int max=a1[0][0];
        for(int i=0;i<r1;i++){
            for(int j=0;j<a1[i].length;j++){
                if(a1[i][j]<min){
                    min=a1[i][j];
                }
                if(a1[i][j]>max){
                    max=a1[i][j];
                }
            }
        }
        System.out.println("Largest Element: "+max+"\nSmallest Element: "+min);
    }
}