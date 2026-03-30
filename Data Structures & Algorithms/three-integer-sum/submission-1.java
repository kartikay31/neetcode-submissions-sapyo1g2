class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i<n-2 ; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1 ;
            int r= n-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                  
                    List<Integer> sub  = Arrays.asList(nums[i],nums[l],nums[r]);
                    res.add(sub);
                     int lv = nums[l], rv = nums[r];
                      while (l < r && nums[l] == lv) l++;
                    while (l < r && nums[r] == rv) r--;
                }else if(nums[i]+nums[l]+nums[r]>0){
                    r-- ;
                }else{
                    l++;
                }
            }
        }
        return res ;
    }
}
