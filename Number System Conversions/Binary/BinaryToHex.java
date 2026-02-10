class BinaryToHex {
    public static void main(String[] args) {
        // Binary to Hexadecimal (via Decimal)
        String binary = "1011010";
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        String hex = "";
        for (; decimal > 0;) {
            int rem = decimal % 16;
            if (rem < 10) {
                hex = rem + hex; 
            }else {
                hex = (char) ((rem - 10) + 'A') + hex;
            }
            decimal /= 16;
        }
        System.out.println(hex);
    }
}
