class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length ; 
        int[] numsnew = new int[2*n];
        for(int i = 0 ; i<2*n ;i++){
            if(i<n){
                numsnew[i]=nums[i];
            }else{
                numsnew[i]=nums[i-n];
            }
        }
        return numsnew ; 
    }
}