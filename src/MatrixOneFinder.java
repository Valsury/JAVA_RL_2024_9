import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MatrixOneFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter matrix size: ");
        int n = scanner.nextInt();


        int[][] matrix = generateRandomMatrix(n);


        System.out.println("Matrix with random values:");
        printMatrix(matrix);


        List<Integer> maxRows = findRowsWithMaxOnes(matrix);
        List<Integer> maxCols = findColumnsWithMaxOnes(matrix);


        System.out.println("Row index(es) with the most ones: " + formatList(maxRows));
        System.out.println("Column index(es) with the most ones: " + formatList(maxCols));
    }


    private static int[][] generateRandomMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2); // Random value (0 or 1)
            }
        }
        return matrix;
    }


    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }


    private static List<Integer> findRowsWithMaxOnes(int[][] matrix) {
        List<Integer> maxRows = new ArrayList<>();
        int maxCount = -1;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRows.clear();
                maxRows.add(i);
            } else if (count == maxCount) {
                maxRows.add(i);
            }
        }

        return maxRows;
    }


    private static List<Integer> findColumnsWithMaxOnes(int[][] matrix) {
        List<Integer> maxCols = new ArrayList<>();
        int maxCount = -1;

        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxCols.clear();
                maxCols.add(j);
            } else if (count == maxCount) {
                maxCols.add(j);
            }
        }

        return maxCols;
    }


    private static String formatList(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}