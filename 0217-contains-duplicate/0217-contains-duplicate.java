class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int cnt=1,flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) flag=1;
        }
        return flag==1;
    }
}