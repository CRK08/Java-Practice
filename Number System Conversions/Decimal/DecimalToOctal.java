class DecimalToOctal {
    public static void main(String[] args) {
        // Decimal to Octal conversion
        int dec = 58;
        String oct = "";
        while (dec > 0) {
            int rem = dec % 8;
            oct = rem + oct;
            dec /= 8;
        }
        System.out.println(oct);
    }
}
