import java.util.*;
class Sum_n_Nos{
    public static void main(String[] args) {
        //Sum of n Numbers
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter n:");
        int a = ab.nextInt();
        int sum = 0;
        for(int i=1;i<=a;i++)
        {
            sum+=i;
            System.out.print(sum+" ");
        }
    }
}