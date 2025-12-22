class Solution {
    public int findNumbers(int[] nums) {
        int ans=0,idx=0,cnt=0;
        while(idx!=nums.length && nums[idx]!=0){
            nums[idx]/=10;
            cnt++;
            if(nums[idx]==0){
                if(cnt%2==0) ans++;
                idx++;
                cnt=0;
            }
        }
        return ans;
    }
}