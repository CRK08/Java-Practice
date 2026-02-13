class NumbAddDecHex{
    public static void main(String[] args) {
        int dec1 = 57;
        int dec2 = 23;
        // Convert first decimal to hex
        String hex1 = "";
        for (; dec1 > 0;) {
            int rem = dec1 % 16;
            if (rem < 10) {
                hex1 = rem + hex1; 
            }else {
                hex1 = (char) ((rem - 10) + 'A') + hex1;
            }
            dec1 = dec1 / 16;
        }
        //Convert second decimal to hex
        String hex2 = "";
        for (; dec2 > 0;) {
            int rem = dec2 % 16;
            if (rem < 10) {
                hex2 = rem + hex2; 
            }else {
                hex2 = (char) ((rem - 10) + 'A') + hex2;
            }
            dec2 = dec2 / 16;
        }
        //hex addition
        String res = "";
        int carry = 0;
        int i = hex1.length() - 1;
        int j = hex2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = 0;
            if (i >= 0) {
                char c1 = hex1.charAt(i);
                if (c1 >= '0' && c1 <= '9') {
                    d1 = c1 - '0';
                } else {
                    d1 = c1 - 'A' + 10;
                }
            }
            int d2 = 0;
            if (j >= 0) {
                char c2 = hex2.charAt(j);
                if (c2 >= '0' && c2 <= '9') {
                    d2 = c2 - '0';
                } else {
                    d2 = c2 - 'A' + 10;
                }
            }
            int sum = d1 + d2 + carry;
            carry = sum / 16;
            int digit = sum % 16;
            if (digit < 10) {
                res = (char) ('0' + digit) + res;
            } else {
                res = (char) ('A' + (digit - 10)) + res;
            }
            i--;
            j--;
        }
        // Convert result back to decimal manually
        int sumDec = 0;
        for (int k = 0; k < res.length(); k++) {
            char c = res.charAt(k);
            int val;
            if (c <= '9') {
                val = c - '0';
            } else {
                val = c - 'A' + 10;
            }
            sumDec = sumDec * 16 + val;
        }
        // Print results
        System.out.println("First Hex: " + hex1);
        System.out.println("Second Hex: " + hex2);
        System.out.println("Sum in Hex: " + res);
        System.out.println("Sum in Decimal: " + sumDec);
    }
}
