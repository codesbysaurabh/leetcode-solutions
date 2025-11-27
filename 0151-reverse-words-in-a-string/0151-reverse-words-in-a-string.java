class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        String[] revwords=new String[words.length];
        int n=words.length;
        for (int i=0;i<n;i++) revwords[i]=words[n-i-1];
        return String.join(" ",revwords);
    }
}