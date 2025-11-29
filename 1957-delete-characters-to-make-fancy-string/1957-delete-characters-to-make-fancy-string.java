class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) count++;
            else count = 1;
            if (count < 3) result.append(s.charAt(i));
        }
        
        return result.toString();
    }
}

/* class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        for (char ch : s.toCharArray()) {
            int len = sb.length();
            if (len >= 2 && sb.charAt(len - 1) == ch && sb.charAt(len - 2) == ch) continue;
            sb.append(ch);
        }
        return sb.toString();
    }
} */