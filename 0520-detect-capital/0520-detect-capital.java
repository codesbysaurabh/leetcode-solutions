class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            }
        }

        if (upper == word.length()) return true;              // ALL CAPS
        if (upper == 0) return true;                           // all lowercase
        if (upper == 1 && Character.isUpperCase(word.charAt(0)))
            return true;                                      // First letter only

        return false;
    }
}
