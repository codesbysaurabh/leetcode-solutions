class Solution {
    public int hammingWeight(int n) {
        int digit,cnt=0,binary=0;
        while(n!=0){
            digit=n%2;
            n/=2;
            if(digit==1) cnt++;
        }
        return cnt;

    }
}