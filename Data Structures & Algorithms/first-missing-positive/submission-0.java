class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length ; 
        int missing  = 0 ;
        for(int i = 0 ; i<n;){
            int v = nums[i] ; 
            if(v>=1 && v<=n && nums[v-1]!=v){
                int temp  = nums[v-1];
                nums[v-1] = nums[i];
                nums[i] = temp ;
            }else{
                i++;
            }

        }
        for(int i = 0 ; i<n ; i++){
            if(i+1 != nums[i]){
                return i+1;
            }
        }
        return n+1;
    }
}