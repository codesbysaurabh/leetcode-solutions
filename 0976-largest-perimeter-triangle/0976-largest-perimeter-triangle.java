class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        /* int sum=0,maxsum=0;
        for(int i=0;i<nums.length-2;i++){
            int a=nums[i],b=nums[i+1],c=nums[i+2];
            if(c<a+b) sum=a+b+c;
            if(sum>maxsum) maxsum=sum;
        } return maxsum;*/
        
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i], b = nums[i - 1], c = nums[i - 2];
            if(c+b>a) return a+b+c;
        }
        return 0;
    }
}