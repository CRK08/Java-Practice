class BinaryToOctal {
    public static void main(String[] args) {
        // Binary to Octal (via Decimal)
        String binary = "1011010";
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        String oct = "";
        while (decimal > 0) {
            oct = (decimal % 8) + oct;
            decimal /= 8;
        }
        System.out.println(oct);
    }
}
