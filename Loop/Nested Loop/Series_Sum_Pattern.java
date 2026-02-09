class Series_Sum_Pattern {
    public static void main(String[] args) {
        // Generate series 9, 99, 999 and print cumulative sum
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            int num = 0;
            for (int j = 0; j < i; j++) {
                num = num * 10;
                num += 9;
            }
            sum += num;
            System.out.println(sum);
        }
    }
}
