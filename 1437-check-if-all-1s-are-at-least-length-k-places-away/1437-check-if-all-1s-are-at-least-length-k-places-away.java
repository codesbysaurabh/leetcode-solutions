class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        /* int count=0;
        for(int n:nums){
            if(n==0) count++;
            if(count<=k && n==1) return false;
            if(n==1) count=0;
        } */
        int count=k+1;
        for(int n:nums){
            if(n==0) count++;
            else {
                if(count<k) return false;
                count=0;
            }
        }
        return true;
    }
}