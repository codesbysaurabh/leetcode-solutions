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

/* class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int index = -1;
        int pos = 0;

        while (temp > 0) {
            if (temp % 10 == 6)
                index = pos;
            
            temp /= 10;
            pos++;
        }

        return (index == -1) ? num : num + 3 * (int)Math.pow(10, index);
    }
} */

/* class Solution {
    public int maximum69Number (int num) {
        String snum = num + "";
        int lastNine = snum.indexOf('6');
        char[] chars = snum.toCharArray();
        if (lastNine != -1) chars[lastNine] = '9';
        return Integer.parseInt(new String(chars));

    }
} */