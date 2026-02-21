import java.util.*;
class RotationIndexRight {
    public static void main(String[] args) {
        //Right Shift Rotation of a Matrix by it's Index times
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int a = ab.nextInt();
        int[][] ar = new int[a][];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter number of columns for row " + i + ":");
            int b = ab.nextInt();
            ar[i] = new int[b];
            System.out.println("Enter elements for row " + i + ":");
            for (int j = 0; j < b; j++) {
                ar[i][j] = ab.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            int times = i; // number of rotations for row i
            int len = ar[i].length;
            for (int t = 0; t < times; t++) {
                int last = ar[i][len - 1]; // save last element of row i
                for (int j = len - 1; j > 0; j--) {
                    ar[i][j] = ar[i][j - 1]; // shift right
                }
                ar[i][0] = last;
            }
        }
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}