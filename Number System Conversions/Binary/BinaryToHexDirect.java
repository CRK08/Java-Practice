class BinaryToHexDirect {
    public static void main(String[] args) {
        // Direct Binary to Hexadecimal conversion
        String binary = "1011010";
        String hex = "";
        while (binary.length() % 4 != 0) {
            binary = "0" + binary;
        }
        for (int i = 0; i < binary.length(); i += 4) {
            int value = 0;
            value += (binary.charAt(i) - '0') * 8;
            value += (binary.charAt(i + 1) - '0') * 4;
            value += (binary.charAt(i + 2) - '0') * 2;
            value += (binary.charAt(i + 3) - '0') * 1;
            if (value < 10) {
                hex += (char) (value + '0'); 
            }else {
                hex += (char) ((value - 10) + 'A');
            }
        }
        System.out.println(hex);
    }
}
