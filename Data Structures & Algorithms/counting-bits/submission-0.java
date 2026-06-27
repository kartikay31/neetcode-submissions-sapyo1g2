class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        int i = 0 ; 
        while(i<=n){
            if(i==0){
                res[0]=0;
            }else if(i==1){
                res[1]=1;
            }else{
                if(i%2==0){
                    res[i]= res[i/2];
                }else{
                    res[i]= res[i/2]+1;
                }
            }
            i++;
        }
        return res;
    }
}
