class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0],min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        return helper(min,max);
    }
    public static int helper(int a,int b){
        if(a==0) return b;
        return helper(b%a,a);
    }
}