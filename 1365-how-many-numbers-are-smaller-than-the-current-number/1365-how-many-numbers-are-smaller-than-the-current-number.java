class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int crt=0,a=0;
        int ans[]=new int[nums.length];
        for(int i:nums){
            for(int j:nums) if(i>j && i!=j) crt++;
            ans[a++]=crt;
            crt=0;
        }
        return ans;
    }
}