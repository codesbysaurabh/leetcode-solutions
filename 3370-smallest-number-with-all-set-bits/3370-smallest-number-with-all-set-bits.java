class Solution {
    public int smallestNumber(int n) {
        int i=(int) (Math.log(n) / Math.log(2))+1;
        int r=(int)(Math.pow(2,i))-1;
        return r;
    }
}