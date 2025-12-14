class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        String hex = "0123456789abcdef";
        String ans = "";

        while (num != 0) {
            ans = hex.charAt(num & 15) + ans;
            num >>>= 4;
        }

        return ans;
    }
}
