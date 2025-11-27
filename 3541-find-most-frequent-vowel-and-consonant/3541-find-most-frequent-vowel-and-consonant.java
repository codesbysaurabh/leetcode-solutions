class Solution {
    public int maxFreqSum(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++) a[s.charAt(i)-'a']++;
        int vowels[]={a['a'-'a'],a['e'-'a'],a['i'-'a'],a['o'-'a'],a['u'-'a']};
        a['a'-'a']=0;a['e'-'a']=0;a['i'-'a']=0;a['o'-'a']=0;a['u'-'a']=0;
        Arrays.sort(a);
        Arrays.sort(vowels);
        return a[a.length-1]+vowels[vowels.length-1];

    }
}