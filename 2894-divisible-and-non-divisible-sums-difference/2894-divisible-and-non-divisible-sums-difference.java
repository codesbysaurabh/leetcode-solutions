class Solution {
    public int differenceOfSums(int n, int m) {
        int nsum=n*(n+1)/2;
        int dsum=0;
        for(int i=m;i<=n;i+=m) dsum+=i;
        return nsum-2*dsum;
    }
}