class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;

        int i=1;
        int j=x;
        int res = 0;

        while(i <= j){
            int mid = i+(j-i)/2;

            if(mid <= x / mid){
                res = mid;
                i = mid + 1; 
            }else{
                j = mid - 1;
            }
        }

        return res;
    }
}