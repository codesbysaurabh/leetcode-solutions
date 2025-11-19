class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        long exp = n;  // convert to long
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        return Math.pow(x, exp);
    }
}