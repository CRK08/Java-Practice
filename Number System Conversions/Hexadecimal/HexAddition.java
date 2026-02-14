class HexAddition {
    public static void main(String[] args) {
        // Hexadecimal number addition using carry logic
        String a = "d56";
        String b = "fa2";
        String result = "";
        a = a.toUpperCase();
        b = b.toUpperCase();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                char ch = a.charAt(i--);
                if (ch >= '0' && ch <= '9') {
                    sum += ch - '0'; 
                }else {
                    sum += ch - 'A' + 10;
                }
            }
            if (j >= 0) {
                char ch = b.charAt(j--);
                if (ch >= '0' && ch <= '9') {
                    sum += ch - '0'; 
                }else {
                    sum += ch - 'A' + 10;
                }
            }
            int digit = sum % 16;
            carry = sum / 16;
            if (digit < 10) {
                result = digit + result; 
            }else {
                result = (char) (digit - 10 + 'A') + result;
            }
        }
        System.out.println(result);
    }
}
