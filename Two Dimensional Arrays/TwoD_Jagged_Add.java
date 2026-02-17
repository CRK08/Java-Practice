import java.util.*;

class TwoD_Jagged_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        int[][] a = new int[r][];
        int[][] b = new int[r][];

        for (int i = 0; i < r; i++) {
            System.out.print("Enter columns for row " + (i + 1) + ": ");
            int c = sc.nextInt();

            a[i] = new int[c];
            b[i] = new int[c];

            System.out.println("Enter A elements:");
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

            System.out.println("Enter B elements:");
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();
        }

        System.out.println("Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + b[i][j] + " ");
            System.out.println();
        }
    }
}
