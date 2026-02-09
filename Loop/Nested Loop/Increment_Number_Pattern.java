class Increment_Number_Pattern {
    public static void main(String[] args) {
        // Print increasing numbers using nested loops
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
