class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1  = 0;
        int c2  = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(cnt1>0 && c1==nums[i]){
               cnt1++; 
               
            }else if(cnt2>0 && c2==nums[i]){
                cnt2++;
                
            }else if(cnt1==0){
                c1 = nums[i];
                cnt1++;
            }else if(cnt2==0){
                c2 = nums[i];
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i = 0 ; i <nums.length ;i++){
            if(nums[i]==c1){
                cnt1++ ;
            }else if(nums[i]==c2){
                cnt2++;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        if(cnt1 > (nums.length/3)){
            res.add(c1);
        } 
        if(cnt2 > (nums.length/3)) {
            res.add(c2);
        }


        return res;

    }
}