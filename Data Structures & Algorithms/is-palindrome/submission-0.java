class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String str = new StringBuilder(clean).reverse().toString();

        return clean.equals(str);
    }
}
