class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1 , j= b.length()-1 ;
        if(i!=j){
            String s = "";
            if(i>j){
                for(int m = 0 ; m<i-j ; m++ ){
                    s =s +"0";
                }
                b=s+b;
            }else{
                for(int m = 0 ; m<j-i ; m++ ){
                    s =s +"0";
                }
                a= s+a ;
            }
        }
        int l = a.length()-1;
    StringBuffer sb = new StringBuffer();
        int carry =0 ; 
        while(l>=0){
            int sum = carry ;
            sum += (a.charAt(l) - '0') + (b.charAt(l) - '0');
            sb =  sb.insert(0,sum%2) ;
            carry = sum/2;
            l--;
        }
        if(carry==1){
            sb = sb.insert(0,1);
        }
        return sb.toString();
    }
}