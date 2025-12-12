class Solution {
    public String convertToTitle(int c) {
        StringBuilder ans = new StringBuilder();

        while (c > 0) {
            c--;  // Excel columns are 1-indexed
            int rem = c % 26;
            ans.append((char)('A' + rem));
            c /= 26;
        }

        return ans.reverse().toString();
    }
}
