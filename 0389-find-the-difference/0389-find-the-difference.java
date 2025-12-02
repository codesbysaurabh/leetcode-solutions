class Solution {
    public char findTheDifference(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int lctn =0;
        for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return b[i];
        return b[b.length-1];
    }
}
//would check out when free
/* class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return result;
    }
}
 */