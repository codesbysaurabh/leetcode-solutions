class Solution {
    public int fib(int n) {
        int a=0,b=1,temp=0;
        for(int i=0;i<n;i++){
            temp=a;
            a=a+b;
            b=temp;
        }
        return a;
    }
}