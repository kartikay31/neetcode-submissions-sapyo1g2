class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> st = new TreeSet<Integer>();
        for(int i = 0 ; i<nums.length ; i++){
            st.add(nums[i]);
        }
        int i = 0 ;
        for(int num : st){
            nums[i++] = num;
        }
        return st.size();
    }
}