class Alphabet_Diamond_Pattern {
    public static void main(String[] args) {
    // Print alphabet pyramid (upper part)
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j < 3; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + (char) (64 + k));
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(" " + (char) (64 + k));
            }
            System.out.println();
        }
        // Print alphabet pyramid (lower part)
        for (int i = 2; i >= 1; i--) {
            for (int j = i; j < 3; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + (char) (64 + k));
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(" " + (char) (64 + k));
            }
            System.out.println();
        }
    }
}
