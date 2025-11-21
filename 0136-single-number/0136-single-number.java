class Solution {
    public int singleNumber(int[] nums) {
        int target=0;
        for(int n : nums) target^=n;
        return target;
    }
}

        //for(int i=0;i<nums.length;i++) target^=nums[i];