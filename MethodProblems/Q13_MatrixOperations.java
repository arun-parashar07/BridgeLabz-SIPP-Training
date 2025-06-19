package methodsSheetSolutions;

public class Q13_MatrixOperations {
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int)(Math.random() * 10);
        return mat;
    }

    public static int determinant2x2(int[][] mat) {
        return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
    }

    public static int determinant3x3(int[][] mat) {
        return mat[0][0]*(mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1]) -
                mat[0][1]*(mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0]) +
                mat[0][2]*(mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0]);
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix2 = createRandomMatrix(2, 2);
        int[][] matrix3 = createRandomMatrix(3, 3);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);
        System.out.println("Determinant: " + determinant2x2(matrix2));

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3);
        System.out.println("Determinant: " + determinant3x3(matrix3));
    }
}
