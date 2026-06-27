class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<Integer>();
        int sum = sumNum(n);
        while(!st.contains(sum)){
            st.add(sum);
            sum = sumNum(sum);
            if(sum==1){
                return true;
            }
        }
        return false ;
    }

    private int sumNum(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum ;
    }
}
