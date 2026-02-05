import java.util.*;
class N_Nos{
    public static void main(String[] args) {
        //Print n Numbers
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Series Total:");
        int n =ab.nextInt();
        int i=0;
        System.out.println("Series of Number up to "+i+" :");
        for(;i<=n;){
            System.err.print(i+" ");
            ++i;
        }
    }
}