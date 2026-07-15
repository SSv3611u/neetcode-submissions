class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax = height[i];
        int rmax = height[j];
        int sum = 0;

        while(i < j){
            if(lmax < rmax){
                i++;
                lmax = Math.max(lmax,height[i]);
                sum += lmax - height[i];
            }else{
                j--;
                rmax = Math.max(rmax,height[j]);
                sum += rmax - height[j];
            }
        }

        return sum;
    }
}
