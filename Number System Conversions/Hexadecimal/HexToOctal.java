class HexToOctal {
    public static void main(String[] args) {
        // Hexadecimal to Octal conversion
        String hex = "2D";
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0'; 
            }else {
                value = (ch - 'A') + 10;
            }

            decimal = decimal * 16 + value;
        }
        String oct = "";
        while (decimal > 0) {
            oct = (decimal % 8) + oct;
            decimal /= 8;
        }
        System.out.println(oct);
    }
}
