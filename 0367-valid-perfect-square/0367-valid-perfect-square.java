class Solution {
    public boolean isPerfectSquare(int num) {
        int x = (int)Math.sqrt(num);
        return x * x == num;
    }
}
/* class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
} */