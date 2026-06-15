class Solution {
    public boolean lemonadeChange(int[] bills) {
        int billsfive  = 1 ;
        int billsten = 0 ;
        int billst = 0;
        if (bills[0]!=5 ){
            return false;
        }
        for(int i = 1 ; i<bills.length ; i++){
                //if amount is 5 simply increment bills five
                if(bills[i]==5){
                    billsfive ++ ;
                }else if(bills[i]==10){
                    if(billsfive==0){
                        return false;
                    }else{
                        billsfive--;
                        billsten++;
                    }
                }else if(bills[i]==20){
                    if( (billsfive <1) || (billsfive<3 && billsten==0)  ){
                        return false;
                    }
                    else if(billsten>0){
                        billsfive--;
                        billsten--;
                    }else {
                        billsfive = billsfive -3;
                    }
                    billst++;
                }  

        }
        return true ;
    }
}