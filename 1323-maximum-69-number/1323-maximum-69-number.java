class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int flag=0,digit;
        while (num > 0) {
            digit= num % 10;
            list.add(0,digit);
            num /= 10;
        }
        int nums = 0;
        for (int d : list){
            if(flag==0 && d==6) {
                d=9;
                flag++;
            }
             nums = nums * 10 + d;
        }
        return nums;
    }
 
}