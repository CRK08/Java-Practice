import java.util.*;

class TwoD_Jagged_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        int[][] a = new int[r][];

        for (int i = 0; i < r; i++) {
            System.out.print("Enter columns for row " + (i + 1) + ": ");
            int c = sc.nextInt();
            a[i] = new int[c];

            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        }

        System.out.println("Jagged Array:");
        for (int[] row : a) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
