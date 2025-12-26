class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        for(String s1:word1) a.append(s1);
        for(String s2:word2) b.append(s2);
        return a.toString().equals(b.toString());

    }
}