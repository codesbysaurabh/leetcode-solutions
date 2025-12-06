class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int x : nums) total += x;

        if (total % 2 != 0) return 0;
        return nums.length - 1;
    }
}

/* class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int x : nums) total += x;
        
        // If total is odd, no partition can satisfy the condition
        if (total % 2 != 0) return 0;
        
        int prefix = 0, count = 0;
        // Check partitions only up to n-2 index (i < n-1)
        for (int i = 0; i < nums.length - 1; i++) {
            prefix += nums[i];
            if (prefix % 2 == 0) count++;
        }
        
        return count;
    }
}
 */