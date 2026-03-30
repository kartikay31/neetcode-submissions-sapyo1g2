class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res  =  new int[nums.length-k+1];
        int resultI = 0 ;
        if(nums.length ==0 || k == 0){
            return new int[0];
        }
        Deque<Integer> deque = new ArrayDeque<>(); 
        int n = nums.length;
        for(int i  = 0 ; i<n ; i++ ){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i>=k-1){
                res[resultI] = nums[deque.peekFirst()] ;
                resultI++;
            }
        }
            return res ;
            
    }
}
