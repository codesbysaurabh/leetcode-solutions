// tried alot but ended up using chatgpt test case 3 is real bish
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;   // done, no carry needed
            }
            digits[i] = 0;        // was 9, becomes 0, carry to next
        }

        // if we reached here, it means all digits were 9
        int[] arr = new int[n + 1];
        arr[0] = 1;
        return arr;
    }
}


//this logic worked good for normal value but for very large value int num overflowed and returned garbage values
/* class Solution {
    public int[] plusOne(int[] digits) {
        int num=0;
        for(int d : digits) num=num*10+d;
        num++;
        
        /* int temp = num;
        int count = 0;
        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] arr = new int[count];
        // Fill from end
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        } '*'/

        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }
} */

// tried vibe coding (T-T)
/* class Solution {
    public int[] plusOne(int[] digits) {
        String s1 = Arrays.toString(digits);
        int num = Integer.parseInt(s1);
        num++;

        String s = String.valueOf(num);
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }
} */