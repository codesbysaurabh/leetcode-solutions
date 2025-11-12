class Solution {
    public int reverse(int x) {
        int revx = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            // Check for overflow before it happens
            if (revx > Integer.MAX_VALUE / 10 || (revx == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // positive overflow
            }
            if (revx < Integer.MIN_VALUE / 10 || (revx == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // negative overflow
            }
            
            revx = revx * 10 + digit;
        }
        return revx;
    }
}
