//0(N) just simply did it
class Solution {
    public int searchInsert(int[] nums, int target) {
    int i=0;
        while(i < nums.length && nums[i]<target ){
            i++;
        }
        return i;
    }
}

//can do binary search for 0(log n)
/* class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }
} */
