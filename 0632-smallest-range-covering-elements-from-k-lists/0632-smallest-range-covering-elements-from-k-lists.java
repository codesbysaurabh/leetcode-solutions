class Solution {

    class Triplet implements Comparable<Triplet> {
        int ele;
        int row;
        int col;

        Triplet(int ele, int row, int col) {
            this.ele = ele;
            this.row = row;
            this.col = col;
        }

        public int compareTo(Triplet t) {
            return this.ele - t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int k = nums.size();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            int ele = nums.get(i).get(0);
            max = Math.max(max, ele);
            pq.add(new Triplet(ele, i, 0));
        }

        int a = pq.peek().ele;
        int b = max;

        while (true) {
            Triplet top = pq.remove();
            int ele = top.ele;
            int row = top.row;
            int col = top.col;
            if (max - ele < b - a) {
                a = ele;
                b = max;
            }
            if (col == nums.get(row).size() - 1) break;
            int next = nums.get(row).get(col + 1);
            max = Math.max(max, next);
            pq.add(new Triplet(next, row, col + 1));
        }
        return new int[]{a, b};
    }
}