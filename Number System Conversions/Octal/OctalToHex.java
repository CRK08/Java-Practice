class OctalToHex {
    public static void main(String[] args) {
        // Octal to Hexadecimal conversion
        int decimal = 282;
        String hex = "";
        while (decimal > 0) {
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
