class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        while(l<m &&r<n){
            if(g[r]<=s[l]){
                r++;
            }
            l++;
        }
        return r;
    }
}

/* class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int rslt=0;
        int i=0,j=0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) i++;
            j++;
        }
        return i;
    }
} */

/* class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int rslt=0;
        int i=0,j=0;
        for(i=0;i<Math.min(s.length,g.length);i++) if(s[i]>=g[i]) rslt++;
        return rslt;
    }
} */