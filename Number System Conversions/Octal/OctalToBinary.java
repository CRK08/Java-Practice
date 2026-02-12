class OctalToBinary {
    public static void main(String[] args) {
        // Octal to Binary conversion
        int decimal = 282;
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        System.out.println(binary);
    }
}
