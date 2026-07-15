class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;

        int max = 0;
        int curr = Integer.MAX_VALUE;

        while(i < j){
            if(heights[i] < heights[j]){
                curr = heights[i] * (j-i);
                i++;
            }else{
                curr = heights[j] * (j-i);
                j--;
            }
        max = Math.max(curr,max);
        }


        return max;
    }
}
