class BinaryToOctalDirect {
    public static void main(String[] args) {
        // Direct Binary to Octal conversion
        String binary = "1011010";
        String oct = "";
        while (binary.length() % 3 != 0) {
            binary = "0" + binary;
        }
        for (int i = 0; i < binary.length(); i += 3) {
            int value = 0;
            value += (binary.charAt(i) - '0') * 4;
            value += (binary.charAt(i + 1) - '0') * 2;
            value += (binary.charAt(i + 2) - '0') * 1;
            oct += value;
        }
        System.out.println(oct);
    }
}
