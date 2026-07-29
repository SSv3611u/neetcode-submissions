class Solution {
    public String rev(String s,int i,int j){
        int n = s.length();
        while(i >= 0 && j < n){
            if(s.charAt(i) == s.charAt(j)){
                i--;
                j++;
            }else{
                break;
            }
        }

        return s.substring(i+1,j);
    }
    public String longestPalindrome(String s) {
        String max = "";
        for(int i=0;i<s.length();i++){
            String odd=rev(s,i,i);
            String even=rev(s,i,i+1);
            if(even.length() > odd.length()){
                if(even.length() > max.length()){
                    max = even;
                }
            }else{
                if(odd.length() > max.length()){
                    max = odd;
                }
            }
        }

        return max;
    }
}
