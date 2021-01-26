package freecodecamp.dynamic_programming.tabulation;

public class GridTraveller {
    // O(m*n) time, O(m*n) space
    public int gridTraveler(final int rows, final int cols) {
        final int[][] table = new int[rows + 1][cols + 1];

        table[1][1] = 1;

        for (int i = 0; i <= rows; i++)
            for (int j = 0; j <= cols; j++) {
                int curr = table[i][j];
                if (j + 1 <= cols) table[i][j + 1] += curr;
                if (i + 1 <= rows) table[i + 1][j] += curr;
            }

        return table[rows][cols];
    }
}
