//chatgpt said it would not work but it worked as i thought lolh
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        for(int i=0;i<n;i++){
            if(bits[i]==1){
                i++;
                continue;
            }
            if(i==n-1 && bits[i]==0) return true; 
        }
        return false;
    }
}