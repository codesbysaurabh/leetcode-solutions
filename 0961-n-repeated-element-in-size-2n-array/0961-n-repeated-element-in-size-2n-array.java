class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) cnt++;
            else cnt=1;
            if(cnt==nums.length/2) return nums[i];
        }
        return -1;
    }
}