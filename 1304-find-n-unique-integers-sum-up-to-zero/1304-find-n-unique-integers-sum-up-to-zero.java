class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;

        // if odd, keep a zero in middle
        if (n % 2 == 1) {
            ans[index++] = 0;
        }

        // fill pairs: (-x, x)
        for (int x = 1; index < n; x++) {
            ans[index++] = x;
            ans[index++] = -x;
        }

        return ans;
    }
}


//0ms but too forced and lengthy
/* class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];
        int mid;
        if(n%2==0){
            mid=-(n/2);
            for(int i=0;i<n;i++) {
                if(mid==0) mid++;
                ans[i]=mid++;
            }
        }
        else {
            mid=(-(n-1)/2);
            for(int i=0;i<n;i++) ans[i]=mid++;
        }
        return ans;
    }
} */