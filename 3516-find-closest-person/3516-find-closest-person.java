class Solution {
    public int findClosest(int x, int y, int z) {
        double d1,d2;
        d1=Math.pow((z-x),2);
        d2=Math.pow((z-y),2);
        if(d1<d2) return 1;
        else if(d1>d2) return 2;
        return 0;
    }
}