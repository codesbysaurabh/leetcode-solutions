class Solution {
    public int smallestRepunitDivByK(int K) {
        // If K has factors 2 or 5, no repunit can be divisible
        if (K % 2 == 0 || K % 5 == 0) return -1;

        int rem = 0;   // remainder of current repunit
        for (int len = 1; len <= K; len++) {
            rem = (rem * 10 + 1) % K;   // simulate adding one more '1'
            if (rem == 0) return len;   // divisible
        }
        return -1;  // should not reach here for valid K
    }
}
