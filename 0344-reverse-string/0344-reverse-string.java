class Solution {
    public void reverseString(char[] s) {
        ArrayList<Character> list = new ArrayList<>();
        for(char c:s) list.add(c);
        Collections.reverse(list);
        for(int i=0;i<s.length;i++) s[i]=list.get(i);
    }
}

/* class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char temp;
        for(int i=0;i<n/2;i++){
            temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
    }
} */