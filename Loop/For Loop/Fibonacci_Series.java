import java.util.*;
class Fibonacci_Series{
    public static void main(String[] args) {
        //Fibanocci series
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter Number for Fibanocci");
        int no = ab.nextInt();
        int fi = 0, se = 1;
        for(int i=0;i<no;i++){
            System.out.print(fi+" ");
            int next = fi + se;
            fi = se;
            se = next;
        }
    }
}