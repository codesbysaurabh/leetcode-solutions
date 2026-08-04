class Solution {
    public int divide(int dividend, int divisor) {

        // Special overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Find sign of answer
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long before abs
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int quotient = 0;

        while (a >= b) {

            long temp = b;
            int multiple = 1;

            // Keep doubling divisor
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract largest possible multiple
            a -= temp;
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }
}