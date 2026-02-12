class DecimalToHex {
    public static void main(String[] args) {
        // Decimal to Hexadecimal conversion
        int dec = 58;
        String hex = "";
        for (; dec > 0; ) {
        int rem = dec % 16;
            if (rem < 10)
            hex = rem + hex;
            else{
            hex = (char) ((rem - 10) + 'A') + hex;
            }
            dec = dec / 16;
        }
        System.out.println(hex);
    }
}