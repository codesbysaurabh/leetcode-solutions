class Solution {
    public int minimumOperations(int[] nums) {
        int ops = 0;

        for (int x : nums) {
            int r = x % 3;
            if (r != 0) ops++; // r = 1 or 2 both cost 1
        }

        return ops;
    }
}
