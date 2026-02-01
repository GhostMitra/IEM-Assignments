import java.util.Scanner;

/* Result class */
class MagicResult {
    private boolean magic;

    public MagicResult(boolean magic) {
        this.magic = magic;
    }

    public String toString() {
        return magic ? "Magic Matrix" : "Not a Magic Matrix";
    }
}

/* Logic class */
class MagicMatrix {
    private int[][] mat;
    private int n;

    public MagicMatrix(int[][] mat, int n) {
        this.mat = mat;
        this.n = n;
    }

    public MagicResult check() {
        int sum = 0;
        for (int j = 0; j < n; j++)
            sum += mat[0][j];

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++)
                rowSum += mat[i][j];
            if (rowSum != sum)
                return new MagicResult(false);
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++)
                colSum += mat[i][j];
            if (colSum != sum)
                return new MagicResult(false);
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += mat[i][i];
            d2 += mat[i][n - i - 1];
        }

        return new MagicResult(d1 == sum && d2 == sum);
    }
}

/* Driver class */
public class Assignment_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        MagicMatrix obj = new MagicMatrix(mat, n);
        System.out.println(obj.check());

        sc.close();
    }
}
