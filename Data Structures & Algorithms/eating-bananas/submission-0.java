class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int vals:piles){
            r=Math.max(r,vals);
        }
        while(l<=r){
            int mid=(l+r)/2;
            boolean possible=totalhrs(piles,mid,h);
            if(possible){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    boolean totalhrs(int[] piles,int cur,int hrs){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+=piles[i]/cur;
            if(piles[i]%cur!=0){
                total++;
            }
        }
        return total<=hrs;
    }
}
