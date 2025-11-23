class Solution {
    public void reverseString(char[] s) {
       int l=0,r=s.length-1;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l ++;
            r --;
        }
    }
}

//My codes-
//Arraylist is worst for space complexity
/* class Solution {
    public void reverseString(char[] s) {
        ArrayList<Character> list = new ArrayList<>();
        for(char c:s) list.add(c);
        Collections.reverse(list);
        for(int i=0;i<s.length;i++) s[i]=list.get(i);
    }
} */
//memory 48.49MB 58.53%
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