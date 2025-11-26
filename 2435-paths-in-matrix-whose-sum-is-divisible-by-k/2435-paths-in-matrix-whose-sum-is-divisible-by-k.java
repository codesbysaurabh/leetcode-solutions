class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1_000_000_007;

        // dp[i][j][r] = number of paths to (i, j) with sum % k == r
        long[][][] dp = new long[m][n][k];

        // Start cell
        int startRem = ((grid[0][0] % k) + k) % k;  // handle negative if any
        dp[0][0][startRem] = 1;

        // Fill DP table
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int valRem = ((grid[i][j] % k) + k) % k;

                // We already initialized (0,0)
                if (i == 0 && j == 0) continue;

                // Coming from top (i-1, j)
                if (i > 0) {
                    for (int r = 0; r < k; r++) {
                        if (dp[i - 1][j][r] != 0) {
                            int newR = (r + valRem) % k;
                            dp[i][j][newR] = (dp[i][j][newR] + dp[i - 1][j][r]) % MOD;
                        }
                    }
                }

                // Coming from left (i, j-1)
                if (j > 0) {
                    for (int r = 0; r < k; r++) {
                        if (dp[i][j - 1][r] != 0) {
                            int newR = (r + valRem) % k;
                            dp[i][j][newR] = (dp[i][j][newR] + dp[i][j - 1][r]) % MOD;
                        }
                    }
                }
            }
        }

        // We want paths whose sum % k == 0 at bottom-right
        return (int)(dp[m - 1][n - 1][0] % MOD);
    }
}
