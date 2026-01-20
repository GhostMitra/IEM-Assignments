import java.util.Scanner;

/* Result class */
class MatrixSearchResult
{
    private boolean found;
    private int row;
    private int col;

    public MatrixSearchResult(boolean found, int row, int col)
    {
        this.found = found;
        this.row = row;
        this.col = col;
    }

    public String toString()
    {
        return found ? "Element found at position [" + row + "][" + col + "]" : "Element not found";
    }
}

/* Logic class */
class MatrixSearch
{
    private int[][] matrix;

    public MatrixSearch(int[][] matrix)
    {
        this.matrix = matrix;
    }

    public MatrixSearchResult search(int target)
    {
        int n = matrix.length;
        if (n == 0) return new MatrixSearchResult(false, -1, -1);
        int m = matrix[0].length;
        int low = 0, high = n * m - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            int r = mid / m;
            int c = mid % m;

            if (matrix[r][c] == target)
            {
                return new MatrixSearchResult(true, r, c);
            }
            if (matrix[r][c] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return new MatrixSearchResult(false, -1, -1);
    }
}

/* Driver class */
public class Assignment_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        if (r <= 0 || c <= 0)
        {
            System.out.println("Matrix dimensions must be positive.");
            sc.close();
            return;
        }

        int[][] mat = new int[r][c];
        System.out.println("Enter the elements of the matrix (sorted row by row):");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        if (!isMatrixSorted(mat))
        {
            System.out.println("Error: The input matrix is not sorted. This search algorithm requires a sorted matrix.");
            sc.close();
            return;
        }

        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();

        MatrixSearch obj = new MatrixSearch(mat);
        System.out.println("Searching for the element in the matrix...");
        MatrixSearchResult result = obj.search(target);
        System.out.println(result);

        sc.close();
    }

    private static boolean isMatrixSorted(int[][] matrix)
    {
        int rows = matrix.length;
        if (rows == 0)
        {
            return true;
        }
        int cols = matrix[0].length;
        if (cols == 0)
        {
            return true;
        }

        int[] flat = new int[rows * cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                flat[i * cols + j] = matrix[i][j];
            }
        }

        for (int i = 0; i < flat.length - 1; i++)
        {
            if (flat[i] > flat[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}
