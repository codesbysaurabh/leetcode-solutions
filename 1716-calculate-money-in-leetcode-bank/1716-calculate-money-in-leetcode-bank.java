/* class Solution {
    public int totalMoney(int n) {
        int week=0,sum=0,day=0;
        for(int i=0;i<n;i++){
            if(i%7==0) week++;
            day=week+(i%7);
            sum+=day;
        }
        return sum;
    }
} */

class Solution {
    public int totalMoney(int n) {
        int m=1,sum=0,d=1;
        for(int i=1;i<=n;i++){
            sum+=d;
            if(i%7==0) d=++m;
            else d++;
        }
        return sum;
    }
}