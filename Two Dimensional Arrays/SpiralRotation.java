import java.util.*;
class SpiralRotation {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int a = ab.nextInt();
        System.out.println("Enter number of columns:");
        int b = ab.nextInt();
        int[][] ar = new int[a][b];
        System.out.println("Enter elements:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ar[i][j] = ab.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println("");
        }
        // Spiral rotation layer by layer
        int top = 0, bottom = a - 1;
        int left = 0, right = b - 1;
        while (top < bottom && left < right) {
            // Save the first element of this layer
            int prev = ar[top][left];
            // Move top row
            for (int i = left + 1; i <= right; i++) {
                int curr = ar[top][i];
                ar[top][i] = prev;
                prev = curr;
            }
            top++;
            // Move right column
            for (int i = top; i <= bottom; i++) {
                int curr = ar[i][right];
                ar[i][right] = prev;
                prev = curr;
            }
            right--;
            // Move bottom row
            for (int i = right; i >= left; i--) {
                int curr = ar[bottom][i];
                ar[bottom][i] = prev;
                prev = curr;
            }
            bottom--;
            // Move left column
            for (int i = bottom; i >= top; i--) {
                int curr = ar[i][left];
                ar[i][left] = prev;
                prev = curr;
            }
            left++;
            ar[top-1][left-1] = prev;
        }
        // Print rotated matrix
        System.out.println("Matrix after spiral rotation:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}