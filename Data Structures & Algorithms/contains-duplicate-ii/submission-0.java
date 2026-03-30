class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i =  0 ;  i< nums.length ; i++){
            if(set.contains(nums[i])){
                return true ;
            }
            int ele  = nums[i];
            set.add(ele);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false ;
    }
}