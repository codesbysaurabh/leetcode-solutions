class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,range=0;
        for(int i:nums) sum+=i;
        int n=nums.length;
        range= n*(n+1)/2;
        return range-sum;
    }
}

/* Arrays.sort(nums);
        int cnt=-1;
        for(int i:nums) if(i!=++cnt) return cnt;
        return ++cnt; */