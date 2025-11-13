class Solution {
    public int alternateDigitSum(int n) {
        int sum=0,temp=n,count=0,digit,sign=1;
        while(temp!=0){
            temp/=10;
            count++;
        }
        if(count%2==0) sign=-1;
        else sign=1;
        while(n!=0){
            digit=n%10;
            sum+=digit*sign;
            sign=-sign;
            n/=10;
        }
    return sum;
        

    }
}