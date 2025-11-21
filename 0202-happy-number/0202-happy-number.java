class Solution {
    public boolean isHappy(int n) {
        int result=0;
        if (n == 1) return true;
        if (n == 4) return false;

        // if (n == 1|| n == 7) return true;
        // if (n < 10) return false;

        while(n!=0){
            result+=(n%10)*(n%10);
            n/=10;
        }
        return isHappy(result);
    }
}