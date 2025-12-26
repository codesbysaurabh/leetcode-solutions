class Solution {
    public int arraySign(int[] nums) {
    int cnt=0;
    for(int n:nums) {
        if(n==0) return 0;
        else if(n<0) cnt++;
    }
    if(cnt%2==0) return 1;
    return -1;
    }
}