class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int prod1 = nums[n-1] * nums[n-2] * nums[n-3];   // top 3 largest
        int prod2 = nums[0] * nums[1] * nums[n-1];       // 2 smallest + largest

        return Math.max(prod1, prod2);
    }
}


/* class Solution {
    public int maximumProduct(int[] nums) {
        int prod,prodmax=0,sum=0;
        for(int i=0;i<nums.length-2;i++){
            prod=nums[i]*nums[i+1]*nums[i+2];
            if(prod>prodmax) prodmax=prod;
        }
        if(nums.length==3 && prodmax==0) prodmax=nums[0]*nums[1]*nums[2]; 
        return prodmax;
    }
} */