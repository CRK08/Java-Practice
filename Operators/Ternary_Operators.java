public class Ternary_Operators {
    public static void main(String[] args) {
        // Demonstrates ternary operator usage
        // Minimum of two numbers
        int x = 10, y = 25;
        int z = (x < y) ? x : y;
        System.out.println(z);
        // Check even number
        int p = 10;
        boolean r = (p % 2 == 0) ? true : false;  
        System.out.println(r);
        // Even or odd
        int num = 10;
        String result = (num % 2 == 0) ? "even" : "odd";  
        System.out.println(result);
        // Greatest of three
        int d = 47, e = 40, f = 46;
        int max = (d > e) ? ((d > f) ? d : f) : ((e > f) ? e : f); 
        System.out.println(max);
        // Positive/Negative/Zero
        String pnz = (num >= 0) ? ((num != 0) ? "Positive" : "Zero") : "Negative"; 
        System.out.println(pnz);
        // Age check
        int age = 21;
        String res = age >= 18 ? "Major" : "Minor"; 
        System.out.println(res);
        // Four-digit check
        int digit = 23564;
        String Re = digit > 999 && digit < 10000 ? "Four Digit" : "Not Four Digit"; 
        System.out.println(Re);
    }
}