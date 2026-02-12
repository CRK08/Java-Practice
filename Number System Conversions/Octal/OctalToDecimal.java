class OctalToDecimal {
    public static void main(String[] args) {
        // Octal to Decimal conversion
        String oct = "432";
        int decimal = 0;
        for (int i = 0; i < oct.length(); i++) {
            int digit = oct.charAt(i) - '0';
            decimal = decimal * 8 + digit;
        }
        System.out.println(decimal);
    }
}
