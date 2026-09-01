class Solution {
    public int search(int[] nums, int tar) {
        int lo=0,hi=nums.length-1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[lo]==tar) return lo;
            if(nums[hi]==tar) return hi;
            if(nums[mid]==tar) return mid;
            else if (nums[lo]<nums[mid]) {
                if(nums[lo]<=tar && tar<nums[mid]) hi=mid-1;
                else lo=mid+1;
            }
            else {
                if(nums[mid]<tar && tar<=nums[hi]) lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }
}