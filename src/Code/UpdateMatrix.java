package Code;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lisheng on 17-5-8.
 */
public class UpdateMatrix {

    public static int[][] updateMatrix1(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};//定义四个位移方向

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] d : dirs) {
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                if (r < 0 || r >= m || c < 0 || c >= n ||
                        matrix[r][c] <= matrix[cell[0]][cell[1]] + 1) continue;
                queue.add(new int[]{r, c});
                matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
            }
        }

        return matrix;
    }

    public static void updateMatrix12(int[][] matrix) {
        int length = matrix.length;
        int height = matrix[0].length;
        boolean flags[][] = new boolean[length][height];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = step(i, j, matrix, flags);
                }
            }
        }

    }

    public static int step(int x, int y, int[][] array, boolean flags[][]) {
        if (x >= 0 && y >= 0 && x < array.length && y < array[0].length && array[x][y] == 0) {
            return 1;
        }
        if (x < 0 || y < 0 || x >= array.length || y >= array[0].length) {
            return Integer.MAX_VALUE;
        }
        int sumTop = 0;
        int sumBottom = 0;
        int sumLeft = 0;
        int sumRight = 0;
        if (array[x][y] == 1 && !flags[x][y]) {
            flags[x][y] = true;
            sumLeft += step(x - 1, y, array, flags);
            sumBottom += step(x, y + 1, array, flags);
            sumRight += step(x + 1, y, array, flags);
            sumTop += step(x, y - 1, array, flags);
        }
        return Math.min(Math.min(sumTop, sumBottom), Math.min(sumLeft, sumRight));
    }


    public static void main(String[] args) {
        int matrix[][] = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1},
        };
        updateMatrix1(matrix);
    }
}
