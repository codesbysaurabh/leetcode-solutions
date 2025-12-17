class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;
        
        int diff = (sumB - sumA) / 2;
        
        Set<Integer> bobSet = new HashSet<>();
        for (int b : bobSizes) bobSet.add(b);
        
        for (int a : aliceSizes) {
            int b = a + diff;
            if (bobSet.contains(b)) {
                return new int[]{a, b};
            }
        }
        
        return new int[0]; // guaranteed solution exists
    }
}

/* class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int temp,cnt=0,x,y,xsum=0,sum=0;
        for(int i:a) xsum+=i;
        for(int j:b) ysum+=j;

        while(cnt<){
            temp=a[cnt];
            a[cnt]=b[cnt];
            b[cnt]=temp;

            if(xsum!=ysum)
        }

    }
} */