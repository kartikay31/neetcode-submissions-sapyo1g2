class Solution {
    public int jump(int[] nums) {
        int farreach = nums[0] ;
        int curend  = nums[0] ;
        int steps =1 ;
        if(nums.length==1){
            return 0;
        }
        for(int i = 1 ; i < nums.length ; i++){
             farreach = Math.max(farreach,i+nums[i]);
            if(curend == i){
                if(farreach>=nums.length-1){
                   return (i == nums.length - 1) ? steps : steps + 1; 
                }
                curend = farreach;
                steps++ ;
            }
            

        }
        return steps;
    }
}
