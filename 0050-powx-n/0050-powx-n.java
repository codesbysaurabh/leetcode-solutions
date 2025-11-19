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

/*
class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= x;   // multiply when bit is 1
            }
            x *= x;     // square the base
            exp >>= 1;  // shift bits
        }
        return result;
    }
}
*/