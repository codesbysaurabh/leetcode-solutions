class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrs = s.toCharArray();
        Arrays.sort(arrs);
        String sorteds = new String(arrs); 

        char[] arrt = t.toCharArray();
        Arrays.sort(arrt);
        String sortedt = new String(arrt);

        if(sorteds.equals(sortedt)) return true;
        return false;

        //OR return Arrays.equals(arrs, arrt);
    }
}
