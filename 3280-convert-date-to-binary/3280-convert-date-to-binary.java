class Solution {
    public String convertDateToBinary(String date) {
        String[]part=date.split("-");
        int y=Integer.parseInt(part[0]);
        int m=Integer.parseInt(part[1]);
        int d=Integer.parseInt(part[2]);
        return Integer.toBinaryString(y)+"-"+Integer.toBinaryString(m)+"-"+Integer.toBinaryString(d);
    }
}