import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j]==target) return new int [] {i,j};
        return new int [] {};
    }
}

/* import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    if(nums[i]+nums[j]==target) {
                        return new int [] {i,j};
                    }
                }
            }
        }
        return new int [] {};
    }
    public static void main(String arg[]){
        Scanner str = new Scanner(System.in);
        //System.out.println("Enter array size : ");
        //int size =str.nextInt();
        int nums[] = {2,7,11,15};
        System.out.print("Enter target : ");
        int target =str.nextInt();

        int result[]= twoSum(nums,target);
        if (result.length==2)
        System.out.println("["+result[0]+","+result[1]+"]");
        else
        System.out.println("No pair found");
    }
} */
    
