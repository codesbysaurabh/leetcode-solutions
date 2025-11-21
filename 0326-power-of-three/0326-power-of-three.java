class Solution {
    public boolean isPowerOfThree(int n) {
         int rem=n;
         if(rem<=0) return false;
        while(rem%3==0){
            rem/=3;
        }
        if (rem==1) return true;
        return false;
         
    }
}