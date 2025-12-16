class Solution {
    public int splitNum(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) a.append(digits[i]);
            else b.append(digits[i]);
        }

        int num1 = a.length() == 0 ? 0 : Integer.parseInt(a.toString());
        int num2 = b.length() == 0 ? 0 : Integer.parseInt(b.toString());

        return num1 + num2;
    }
}
