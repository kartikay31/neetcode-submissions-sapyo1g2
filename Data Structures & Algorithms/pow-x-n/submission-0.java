class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        if(n<0){
            x=1/x;
            n = -n;
        }
        double half = myPow(x,n/2);
        if(n%2==1){
            return half * half * x;
        }else{
            return half * half ;
        }
    }
}
