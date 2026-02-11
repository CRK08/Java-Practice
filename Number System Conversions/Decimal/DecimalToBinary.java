class DecimalToBinary {
    public static void main(String[] args) {
        // Decimal to Binary conversion
        int dec = 58;
        String bin = "";
        for (; dec > 0;) {
            int rem = dec % 2;
            bin = rem + bin;
            dec /= 2;
        }
        System.out.println(bin);
    }
}
