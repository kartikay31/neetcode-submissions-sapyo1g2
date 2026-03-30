class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> freq  =  new HashMap<Integer,Integer>();
        freq.put(0,1);

        int prefix  = 0 ;
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            prefix =  prefix + nums[i];
            if(freq.containsKey(prefix-k)){
                count += freq.get(prefix-k);
            }
            freq.put(prefix, freq.getOrDefault(prefix,0)+1);
        }

        return count;

    }
}