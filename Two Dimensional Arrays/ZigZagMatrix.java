import java.util.*;

class ZigZagDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Zig-Zag Diagonal Traversal:");
        for (int sum = 0; sum <= rows + cols - 2; sum++) {
            if (sum % 2 == 0) {
                // even diagonal → bottom to top
                for (int i = rows - 1; i >= 0; i--) {
                    int j = sum - i;
                    if (j >= 0 && j < cols) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            } else {
                // odd diagonal → top to bottom
                for (int i = 0; i < rows; i++) {
                    int j = sum - i;
                    if (j >= 0 && j < cols) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}