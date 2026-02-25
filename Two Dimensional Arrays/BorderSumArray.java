// Demonstrates sum of border elements in a 2D array
import java.util.*;

class BorderSumArray {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter number of rows & Columns:");
        int a = ab.nextInt();
        int b = ab.nextInt();

        int[][] ar = new int[a][b];
        System.out.println("Enter Elements");
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
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                    sum += ar[i][j];
                }
            }
        }
        System.out.println("Border Sum = " + sum);
    }
}