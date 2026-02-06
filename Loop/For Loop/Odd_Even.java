import java.util.*;
class Odd_Even{
    public static void main(String[] args) {
        //Printing Series Odd and even Numebrs
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Number for Odd and Even:");
        int n =ab.nextInt();
        int i=0;
        System.out.println("Series of Odd up to "+i+" :");
        for(i=1;i<=n;){
            System.err.print(i+" ");
            i+=2;
        }
        System.out.println("");
        System.out.println("Series of Even up to "+i+" :");
        for(i=0;i<=n;){
            System.err.print(i+" ");
            i+=2;
        }
    }
}