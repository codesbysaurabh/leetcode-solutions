class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        boolean flag;
        for(int i=left;i<=right;i++){
            flag=true;
            int temp=i;
            while(temp!=0){
                int digit=temp%10;
                temp/=10;
                if(digit==0){
                    flag=false;
                    break;
                }
                if(i%digit!=0) flag=false; 
            }
            if(flag) ans.add(i);
        }
        return ans;
    }
}