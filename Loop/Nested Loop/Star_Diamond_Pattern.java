class Star_Diamond_Pattern {
    public static void main(String[] args) {
        // Print upper half of diamond
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= (2 * i) - 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // Print lower half of diamond
        for (int i = 4; i >= 1; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= (2 * i) - 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
