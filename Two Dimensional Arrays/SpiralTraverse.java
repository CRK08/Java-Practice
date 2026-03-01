import java.util.*;
class SpiralTraverse {
    public static void main(String[] args) {
        //Traversing a Matrix in Spiral
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter number of rows & Columns:");
        int a = ab.nextInt();
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
        System.out.println("Spiral traversal:");
        int top = 0, bottom = a - 1;
        int left = 0, right = b - 1;
        while (top <= bottom && left <= right) {
            // Top
            for (int i = left; i <= right; i++) {
                System.out.print(ar[top][i] + " ");
            }
            top++;
            //Right
            for (int i = top; i <= bottom; i++) {
                System.out.print(ar[i][right] + " ");
            }
            right--;
            // Bottom
            for (int i = right; i >= left; i--) {
                System.out.print(ar[bottom][i] + " ");
            }
            bottom--;
            // Left
            for (int i = bottom; i >= top; i--) {
                System.out.print(ar[i][left] + " ");
            }
            left++;
        }
    }
}