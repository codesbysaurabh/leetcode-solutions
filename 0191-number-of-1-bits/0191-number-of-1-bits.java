class Solution {
    public int hammingWeight(int n) {
        int digit,cnt=0,binary=0;
        while(n!=0){
            digit=n%2;
            n/=2;
            binary=binary*10+digit;
            if(digit==0) binary>>=1;
            else cnt++;
        }
        return cnt;

    }
}