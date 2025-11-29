class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int f=0;f<fruits.length;f++){
            for(int b=0;b<baskets.length;b++){
                if(fruits[f]<=baskets[b]) {
                    fruits[f]=0;
                    baskets[b]=0;
                    break;
                }
            }
            if(fruits[f]!=0) count++;
        }
        return count;
    }
}

/* int unplaced=0;
        int n=a.length;
        int m=b.length;
        for(int i=0;i<n;i++){
            boolean placed=false;
            for(int j=0;j<m;j++){
                if(b[j]>=a[i]){
                    b[j]=-1;
                    placed=true;
                    break;
                }
            }
            if(!placed){
                unplaced++;
            }
        }
        return unplaced; */