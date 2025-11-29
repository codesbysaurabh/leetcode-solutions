class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length,cnt=0,j=0;
        for(int i =1;i<n-1;i++)
            if((nums[j] < nums[i] && nums[i] > nums[i+1]) ||
            (nums[j] > nums[i] && nums[i] < nums[i+1])){
                cnt ++;
                j=i;
            }
        return cnt;   
    }
}

//first removed equal elements by creating new array;
/* class Solution {
    public int countHillValley(int[] nums) {
        int[] arr = new int[nums.length];
        int idx = 0;
        arr[idx++] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) arr[idx++] = nums[i];
        }
        //could have used array list too
        int count = 0;
        for (int i = 1; i < idx - 1; i++) {
            if ((arr[i] > arr[i-1] && arr[i] > arr[i+1]) || 
                (arr[i] < arr[i-1] && arr[i] < arr[i+1])) {
                count++;
            }
        }

        return count;
    }
} */
/* class Solution {
    public int countHillValley(int[] n) {
        int count=0,j=1;
        for(int i=1;i<n.length-j;i++){
            if(n[i]==n[i+1]) j++;
            else j=1;
            if((n[i]>n[i-1] && n[i]>n[i+j])||(n[i]<n[i-1] && n[i]<n[i+j])) count++;
        }
        return count;
    }
} */