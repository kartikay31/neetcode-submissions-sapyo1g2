class Solution {
    public boolean isPalindrome(String s) {
        String sl = s.toLowerCase();
        int l = 0 , r = s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(sl.charAt(l))){
                l++ ;
                continue ;
            }
            if(!Character.isLetterOrDigit(sl.charAt(r))){
                r-- ;
                continue ;
            }
            if(!(sl.charAt(l)==(sl.charAt(r)))){
                return false ;
            }
            l++ ;
            r-- ;
        }
        return true ;
    }
}
