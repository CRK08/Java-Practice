import java.util.*;
class TwoD_Swap_Row{
    public static void main(String[] args) {
        //Swapping First and Last row in Two Dimensional Array Using Jagged Array
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
        int[] temp=a1[0];
        a1[0]=a1[r1-1];
        a1[r1-1]=temp;
        System.out.println("Swapped Matrix:");
        for(int i=0;i<r1;i++) {
            for(int j=0;j<a1[i].length;j++){
                System.out.print(a1[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}