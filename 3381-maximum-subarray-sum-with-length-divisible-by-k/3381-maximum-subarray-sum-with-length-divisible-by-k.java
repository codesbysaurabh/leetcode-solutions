class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        long[] minPrefix = new long[k];

        for (int i = 0; i < k; i++) {
            minPrefix[i] = Long.MAX_VALUE;
        }

        minPrefix[0] = 0;  // prefix[0] corresponds to index 0

        long ans = Long.MIN_VALUE;
        boolean found = false;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
            int r = i % k;

            if (minPrefix[r] != Long.MAX_VALUE) {
                ans = Math.max(ans, prefix[i] - minPrefix[r]);
                found = true;
            }

            minPrefix[r] = Math.min(minPrefix[r], prefix[i]);
        }

        return found ? ans : 0;
    }
}
