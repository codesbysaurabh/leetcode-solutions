class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];
        int mid;
        if(n%2==0){
            mid=-(n/2);
            for(int i=0;i<n;i++) {
                if(mid==0) mid++;
                ans[i]=mid;
                mid++;
            }
        }
        else {
            mid=(-(n-1)/2);
            for(int i=0;i<n;i++){
                ans[i]=mid;
                mid++;
            }
        }
        return ans;
    }
}