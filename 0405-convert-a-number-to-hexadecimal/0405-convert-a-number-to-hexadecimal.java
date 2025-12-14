class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        // Process exactly 32 bits
        while (num != 0) {
            int digit = num & 15;     // get last 4 bits
            sb.append(hex[digit]);
            num >>>= 4;              // unsigned shift
        }

        return sb.reverse().toString();
    }
}


/* class Solution {
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
} */