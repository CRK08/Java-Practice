import java.util.*;
class Count_Nos{
    public static void main(String[] args) {
        //Count of Digits in a Number
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Numbers to count:");
        int d =ab.nextInt();
        int i;
        for(i=0;d!=0;i++)
        {
            d/=10;
        }
        System.out.println(i);
    }
}