class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int count=0;
        for(int i=0;i<nums.length && count<nums.length;i++){
            if(val!=nums[i]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}