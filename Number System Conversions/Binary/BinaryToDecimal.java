class BinaryToDecimal {
    public static void main(String[] args) {
        // Binary to Decimal conversion
        String binary = "1011010";
        int decimal = 0, pow = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += (int) Math.pow(2, pow);
            }
            pow++;
        }
        System.out.println(decimal);
    }
}
