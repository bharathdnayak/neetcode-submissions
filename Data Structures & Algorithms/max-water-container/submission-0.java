class Solution {
    public int maxArea(int[] heights) {
        int ans=0;
        int l=0;
        int n=heights.length;
        int r=n-1;
        while(l<r){
            int width=r-l;
            int high=Math.min(heights[l],heights[r]);
            int area=high*width;
            ans=Math.max(ans,area);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}
