class Solution {
    public int kthSmallest(int[][] m, int k) {
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                pq.add(m[i][j]);
                if (pq.size() > k) pq.remove();
            }
        }
        return pq.peek();
    }
}