public class Lesson09Program02 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(8);
        printMatrix(matrix);
    }
    public static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = size - j;
                }
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}