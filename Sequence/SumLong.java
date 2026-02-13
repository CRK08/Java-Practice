import java.math.BigInteger;
import java.util.*;
class sam{
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Value:");
        int dec=ab.nextInt();
        String hex="";
        while(dec>0){
            int rem =dec%16;
            if(rem<10){
                hex = rem+hex;
            }
            else if(rem>=10){
                rem = (rem-10)+'A';
                hex = (char)(rem)+hex;
            }
            dec=dec/16;
        }
        System.out.println(hex);
        BigInteger a = new BigInteger("12345678912456789123456");
        BigInteger b = new BigInteger("12345215745156789123456");
        BigInteger sum = a.add(b);
        System.out.println(sum);
        String c = "1365478995175025456751";
        String d = "9545674125863217418569";
        String res = " ";
        int carry = 0;
        int i = c.length()-1;
        int j = d.length()-1;
        while(i>=0||j>=0||carry>0){
            int d1 = (i>=0)?c.charAt(i)-'0':0;
            int d2 = (j>=0)?d.charAt(i)-'0':0;
            int su = d1+d2+carry;
            carry=su/10;
            res=(su%10)+res;
            i--;
            j--;
        }
        System.out.println(res);
    }
}