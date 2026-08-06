class Solution {
    public int minOperations(int[] nums) {
        int k=3,cnt=0;
        for(int i=0; i<=nums.length-k ; i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                cnt++;
            }
        }
        for (int num : nums) {
            if (num == 0) {
                return -1;
            }
        }
        return cnt;
    }
}