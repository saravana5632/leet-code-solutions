public class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxarea=0;
        int currentheight=0;
        while (l<r){
            int width = r-l;
            currentheight=Math.min(height[l],height[r]);
            int area = width * currentheight;
            maxarea= Math.max(area,maxarea);
            if ( height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
}