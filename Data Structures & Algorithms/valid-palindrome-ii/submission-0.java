class Solution {
    public boolean validPalindrome(String s) {
        int diff = 0;
        int l = 0 ,r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return isPalindrome(l+1,r,s) || isPalindrome(l,r-1,s);
            }
           l++;
           r--;
        }
        return true;
    }
    private boolean isPalindrome(int start, int end, String s){
        while(start<end){
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            }
            start++;
            end -- ;
        }
        return true;
    }
}