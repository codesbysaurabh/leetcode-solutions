class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length , lo = 0, hi = n-1,mid=0;

        if (n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];

        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            int f = mid , s = mid ;
            if(nums[mid]==nums[mid-1]) f=mid-1;
            else s=mid+1;

            int leftcnt = f-lo;
            int rightcnt = hi-s;

            if(leftcnt%2==0) lo = s+1;
            else hi = f-1;
        }

        return nums[mid];
    }
}