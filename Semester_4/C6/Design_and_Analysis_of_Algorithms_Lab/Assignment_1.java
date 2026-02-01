import java.util.Scanner;

/* Result class */
class MatrixResult {
    private int[][] result;

    public MatrixResult(int[][] result) {
        this.result = result;
    }

    public int[][] getResult() {
        return result;
    }
}

/* Logic class */
class MatrixMultiplication {
    private int[][] A, B;

    public MatrixMultiplication(int[][] A, int[][] B) {
        this.A = A;
        this.B = B;
    }

    public MatrixResult multiply() {
        int r1 = A.length;
        int c1 = A[0].length;
        int c2 = B[0].length;

        int[][] C = new int[r1][c2];

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    C[i][j] += A[i][k] * B[k][j];

        return new MatrixResult(C);
    }
}

/* Driver class */
public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows of Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of Matrix A: ");
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.print("Enter number of rows of Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of Matrix B: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            sc.close();
            return;
        }

        int[][] B = new int[r2][c2];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        MatrixMultiplication obj = new MatrixMultiplication(A, B);
        int[][] res = obj.multiply().getResult();

        System.out.println("Resultant Matrix:");
        for (int[] row : res) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }

        sc.close();
    }
}
