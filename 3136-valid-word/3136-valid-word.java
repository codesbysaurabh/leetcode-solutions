class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (!isAlphaNumeric(ch)) return false;
            if (isVowel(ch)) hasVowel = true;
            else if (Character.isLetter(ch)) hasConsonant = true;
        }

        return hasVowel && hasConsonant;
    }
    private boolean isAlphaNumeric(char ch) {
        return (ch >= '0' && ch <= '9') || 
               (ch >= 'A' && ch <= 'Z') || 
               (ch >= 'a' && ch <= 'z');
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}