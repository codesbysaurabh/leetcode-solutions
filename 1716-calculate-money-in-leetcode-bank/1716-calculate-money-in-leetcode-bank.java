class Solution {
    public int totalMoney(int n) {
        int week=0,sum=0,day=0;
        for(int i=0;i<n;i++){
            if(i%7==0) week++;
            day=week+(i%7);
            sum+=day;
        }
        return sum;
    }
}

/* class Solution {
    public int totalMoney(int n) {
        int m=1,sum=0,d=1;
        for(int i=1;i<=7 && n!=0;i++){
            if(i==1) d=m;
            sum+=(d++);
            if(i==7) {
                m++;
                i=0;
            }
            n--;
        }
        return sum;
    }
} */