class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0 ;
        }
        if(x==1 || x==2 || x==3){
            return 1;
        }
        int l = 1 , r = x/2;
        int result  = 0 ;
        while(l<=r){
            int mid = (r-l)/2+l;
            int res = x/mid;
            if(mid<=res){
                result = mid ;
                l = mid+1 ;
                
            }else if(mid>res) {
                r = mid -1 ;
            }
        }
        return result;
    }
}