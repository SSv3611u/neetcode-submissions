class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String p1 = strs[0];
        String p2 = strs[strs.length - 1];
        int i=0;
        int j=0;

        while(i < p1.length()){
            if(p1.charAt(i) == p2.charAt(j)){
                i++;
                j++;
            }else{
                break;
            }
        }

        return p2.substring(0,i);
    }
}