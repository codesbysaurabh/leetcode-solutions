class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peakidx=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>arr[peakidx]) peakidx=i;
      } 
      return peakidx; 
    }
}