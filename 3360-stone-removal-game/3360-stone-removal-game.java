class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) return false;

        int need = 10;
        boolean aliceTurn = true;

        while (n >= need) {
            n -= need;
            need--;
            aliceTurn = !aliceTurn;
        }
        return !aliceTurn; // Bob failed ⇒ Alice wins
    }
}

/* class Solution {
    public boolean canAliceWin(int n) {
        return n >= 10;
    }
} */