class Solution {
    public boolean checkValidString(String s) { 
        int o = 0 ;
        int c = 0 ;
        int star = 0 ;
        
        for(int  i = 0 ; i< s.length() ; i++){
            if(s.charAt(i)=='('){
               o++;
            }else if(s.charAt(i)==')'){
                c++;
            }else{
                star++;
            }
            if(c>o+star){
                return false;
            }
           
        }

        o = 0;
        c = 0;
        star = 0;
        for(int  i = s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i)=='('){
               o++;
            }else if(s.charAt(i)==')'){
                c++;
            }else{
                star++;
            }
            if(o>c+star){
                return false;
            }
           
        }
        
        return true ;
    }
}
