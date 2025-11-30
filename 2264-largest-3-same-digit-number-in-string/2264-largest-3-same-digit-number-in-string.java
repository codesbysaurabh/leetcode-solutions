class Solution {
    public String largestGoodInteger(String num) {
        char[] c = num.toCharArray();
        int cnt = 1;
        char best = '0' - 1; // smaller than any digit
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                cnt++;
            } else {
                cnt = 1;
            }
            if (cnt == 3) {
                best = (char)Math.max(best, c[i]);
            }
        }
        if (best < '0') return ""; // no lucky triple found
        return "" + best + best + best;
    }
}
