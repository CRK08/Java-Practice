public class Behaviours {
    public static void main(String[] args) {
        // Demonstrates behavior of System.out.println with different data types
        System.out.println("Hello" + 123);          // String + number
        System.out.println('A' + 'B' + "Hi");       // Char addition + String
        System.out.println("Hai" + 'A' + 'B');      // String + char
        System.out.println("Example:" + (52 + 3) + 5); // Arithmetic inside println
        System.out.println(2 + 3 + "Hello");        // Number + String
        System.out.println(true + "false" + true);  // Boolean + String
        System.out.println('A' + 10 + "Hai");       // Char + number + String
    }
}