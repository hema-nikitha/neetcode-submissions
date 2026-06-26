class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxarea=0;
        while(l<r){
            int width=r-l;
            int h=Math.min(heights[l],heights[r]);
            int area=width*h;
            maxarea=Math.max(area,maxarea);
        
        if(heights[l]<heights[r]){
            l++;
        }
        else{
            r--;
        }
        }
        return maxarea;
        
    }
}
