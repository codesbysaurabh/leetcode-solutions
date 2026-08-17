class Solution {
    public int maximumCount(int[] nums) {
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<0) lo=mid+1;
            else hi=mid-1;
        }
        int negCnt=lo;
        lo=0;
        hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>0) hi=mid-1;
            else lo=mid+1;
        }
        int posCnt=nums.length-lo;
        int ans=posCnt>negCnt?posCnt:negCnt;
        return ans;

    }
}