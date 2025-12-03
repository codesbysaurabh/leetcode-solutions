class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt=-1;
        for(int i:nums) if(i!=++cnt) return cnt;
        return ++cnt;
    }
}