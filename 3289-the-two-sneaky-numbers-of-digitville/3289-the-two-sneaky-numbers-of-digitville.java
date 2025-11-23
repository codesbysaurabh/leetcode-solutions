class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int []s=new int[2];
        int a=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) s[a++]=nums[i];
            if(a==2) break;
        } 
        return s;
    }
}