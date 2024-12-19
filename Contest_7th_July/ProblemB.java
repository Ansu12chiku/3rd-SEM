package Contest_7th_July;
import java.util.Scanner;

public class ProblemB{
    
    public static boolean possibleornot(int[][] gridA, int[][] gridB, int rows, int cols) {
        for (int r = rows - 1; r >= 1; --r) {
            for (int c = cols - 1; c >= 1; --c) {
                if (gridA[r][c] != gridB[r][c]) {
                    int d = (gridB[r][c] - gridA[r][c] + 3) % 3;
                    gridA[r][c] = gridB[r][c];
                    gridA[r-1][c] = (gridA[r-1][c] + 2 * d) % 3;
                    gridA[r][c-1] = (gridA[r][c-1] + 2 * d) % 3;
                    gridA[r-1][c-1] = (gridA[r-1][c-1] + d) % 3;
                }
            }
        }
        for (int row = 0; row < rows; ++row) {
            if (gridA[row][0] != gridB[row][0]) return false;
        }
        for (int col = 0; col < cols; ++col) {
            if (gridA[0][col] != gridB[0][col]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while (t-- > 0) {
            int rows = obj.nextInt();
            int cols = obj.nextInt();

            int[][] firstGrid = new int[rows][cols];
            int[][] secondGrid = new int[rows][cols];

            for (int row = 0; row < rows; ++row) {
                String line = obj.next();
                for (int col = 0; col < cols; ++col) {
                    firstGrid[row][col] = line.charAt(col) - '0';
                }
            }

            for (int row = 0; row < rows; ++row) {
                String line = obj.next();
                for (int col = 0; col < cols; ++col) {
                    secondGrid[row][col] = line.charAt(col) - '0';
                }
            }
            if (possibleornot(firstGrid, secondGrid, rows, cols)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        obj.close();
    }
}
