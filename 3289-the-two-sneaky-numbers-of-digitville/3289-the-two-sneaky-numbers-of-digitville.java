//i like how this one worjs and wished to save
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int result[] = new int[2], count[] = new int[n];
        int a=0;
        for (int i=0;i<nums.length;i++) 
            if(++count[nums[i]]== 2) result[a++] = nums[i];
        return result;
    }
}
//My code, it had 6ms
/* class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int []s=new int[2];
        int a=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) s[a++]=nums[i];
            if(a==2) break;
        } 
        return s;
    }
} */