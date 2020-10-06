import java.util.Scanner;

public class MatrixMult {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size for matrix A (for mult.):");
        int na = sc.nextInt();
        System.out.println("Enter column size for matrix A (for mult.):");
        int ma = sc.nextInt();
        System.out.println("Enter row size for matrix b (for mult.):");
        int nb = sc.nextInt();
        System.out.println("Enter column size for matrix b (for mult.):");
        int mb = sc.nextInt();
        int[][] A = new int[na][ma];
        int[][] B = new int[nb][mb];
        System.out.println("Enter elements of A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        if (na != mb) {
            System.out.println("Not possible.");

        } else {
            int[][] C = new int[na][mb];
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[i].length; j++) {
                    for (int k = 0; k < ma; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

