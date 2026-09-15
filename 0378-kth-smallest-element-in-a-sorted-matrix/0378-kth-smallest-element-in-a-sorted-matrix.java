//USING BINARY SEARCH
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countLessEqual(matrix, mid);
            if (count < k) left = mid + 1;
            else right = mid;
        }
        return left;
    }
    private int countLessEqual(int[][] matrix, int target) {
        int n = matrix.length;
        int row = 0;
        int col = n - 1;
        int count = 0;
        while (row < n && col >= 0) {
            if (matrix[row][col] <= target) {
                count += col + 1;
                row++;
            } else col--;
        }
        return count;
    }
}
//USING HEAP
// class Solution {
//     public int kthSmallest(int[][] m, int k) {
//         PriorityQueue<Integer> pq =
//             new PriorityQueue<>(Collections.reverseOrder());

//         for (int i = 0; i < m.length; i++) {
//             for (int j = 0; j < m[0].length; j++) {
//                 pq.add(m[i][j]);
//                 if (pq.size() > k) pq.remove();
//             }
//         }
//         return pq.peek();
//     }
// }