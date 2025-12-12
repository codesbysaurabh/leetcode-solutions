class Solution {
    public int titleToNumber(String c) {
        int num=0;
        for(char s:c.toCharArray()) num = num*26 + s-'A'+1 ;
        return num;
    }
}