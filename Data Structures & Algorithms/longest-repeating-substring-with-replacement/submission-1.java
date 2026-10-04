class Solution {
    public int characterReplacement(String s, int k) {
        int[] ct = new int[26];
        int maxlen = 0;
        int maxfreq = 0;
        int i=0;

        for(int j=0;j<s.length();j++){
            char rchar = s.charAt(j);
            ct[rchar - 'A']++;

            maxfreq = Math.max(maxfreq, ct[rchar - 'A']);

            if((j - i + 1) - maxfreq > k){
                char lchar = s.charAt(i);
                ct[lchar - 'A']--;
                i++;
            }

            maxlen = Math.max(maxlen, j - i + 1);

        }
            return maxlen;
    }
}
