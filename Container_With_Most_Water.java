class Solution {
    public int maxArea(int[] heights) {
        int maxwater=Integer.MIN_VALUE;
        int height=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
        height=Math.min(heights[i],heights[j]);
        int area=height*(j-i);
        maxwater=Math.max(maxwater,area);
        if(heights[i]<heights[j]){
            i++;
        }
       else {
            j--;
        }
        

        }
        return maxwater;
        
    }
}
