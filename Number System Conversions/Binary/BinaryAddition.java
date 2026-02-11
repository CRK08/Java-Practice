class BinaryAddition {
    public static void main(String[] args) {
        // Binary number addition using carry logic
        String a = "10011";
        String b = "11000";
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result = result + (sum % 2);
            carry = sum / 2;
        }       
        // Reverse and print result
        for (int k = result.length() - 1; k >= 0; k--) {
            System.out.print(result.charAt(k));
        }
        System.out.println();
    }
}
