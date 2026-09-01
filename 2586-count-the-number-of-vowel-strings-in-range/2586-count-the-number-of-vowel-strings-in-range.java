class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            String s = words[i];

            if (isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1))) count++;
        }

        return count;
    }

    public boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}