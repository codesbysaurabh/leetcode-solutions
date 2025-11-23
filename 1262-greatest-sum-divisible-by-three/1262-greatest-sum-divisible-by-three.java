class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> mod1 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();

        // Compute sum and separate numbers by mod
        for (int x : nums) {
            sum += x;
            if (x % 3 == 1) mod1.add(x);
            else if (x % 3 == 2) mod2.add(x);
        }

        // Already divisible
        if (sum % 3 == 0) return sum;

        // Sort to get smallest deletions
        Collections.sort(mod1);
        Collections.sort(mod2);

        int ans = 0;

        // Case 1: sum % 3 == 1
        if (sum % 3 == 1) {
            int remove1 = mod1.size() > 0 ? mod1.get(0) : Integer.MAX_VALUE;
            int remove2 = mod2.size() > 1 ? (mod2.get(0) + mod2.get(1)) : Integer.MAX_VALUE;
            ans = sum - Math.min(remove1, remove2);
        }

        // Case 2: sum % 3 == 2
        else {
            int remove1 = mod2.size() > 0 ? mod2.get(0) : Integer.MAX_VALUE;
            int remove2 = mod1.size() > 1 ? (mod1.get(0) + mod1.get(1)) : Integer.MAX_VALUE;
            ans = sum - Math.min(remove1, remove2);
        }

        return ans < 0 ? 0 : ans;
    }
}
