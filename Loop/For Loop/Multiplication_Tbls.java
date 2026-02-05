import java.util.*;
class Multiplication_Tbls{
    public static void main(String[] args) {
        //Multiplication Tables
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter the Table:");
        int a =ab.nextInt();
        System.out.println("Total to print:");
        int b = ab.nextInt();
        for(int i=1;i<=b;i++)
        {
            System.err.println(i +" * "+ a +" = "+ i*a);
        }
    }
}