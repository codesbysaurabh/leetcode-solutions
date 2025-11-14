class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0/*, maxsum=0 */;
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         sum=Math.min(nums[i],nums[j])+Math.min(nums[k],nums[l]);
        //         if(sum>maxsum) maxsum=sum;
        //     }
        // }

        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}