class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for (int num : arr) freq[num]++;
        int luckyNum = -1;
        for (int i = 1; i <= 500; i++) if (freq[i] == i) luckyNum = i;
        return luckyNum;
    }
}


/* class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int luckyNum=-1,cnt=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) cnt++;
            else {
                if (cnt == arr[i]) luckyNum = Math.max(luckyNum, arr[i]);
            }
            cnt=1;
        }
        if (cnt == arr[arr.length - 1]) {
            luckyNum = Math.max(luckyNum, arr[arr.length - 1]);
        }
        return luckyNum;    
    }
} */