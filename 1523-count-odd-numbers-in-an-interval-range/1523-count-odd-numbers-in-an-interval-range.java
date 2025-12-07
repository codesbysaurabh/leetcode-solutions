class Solution {
    public int countOdds(int low, int high) {
        int ans=0;
        if(high%2==1 || low%2==1) ans=1;
        high=high-low;
        //low=0;
        ans+=high/2;
        return ans;
    }
}

    /* for(int i=low;i<=high;i++) if(i%2==1) cnt++;
       return cnt; */