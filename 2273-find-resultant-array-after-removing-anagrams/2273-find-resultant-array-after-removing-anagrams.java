class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        ans.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], ans.get(ans.size() - 1))) {
                ans.add(words[i]);
            }
        }
        
        return ans;
    }
    public boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}