class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        // for (String op : operations) x+=op.contains("+")?1:-1;
        for (String op : operations) x+=op.charAt(1)=='+'?1:-1;
        return x;
    }
}

/* class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(0)!=('X')){
                if(operations[i].charAt(0)==('+')) ++x;
                else --x;
            }
            else {
                if(operations[i].charAt(2)==('+')) x++;
                else x--;
            }
        }
        return x;
    }
} */
