class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0 ; i<a.length ; i++){
            if(st.isEmpty() || (st.peek()>0 && a[i]>0) || st.peek()<0){
                st.push(a[i]);
            }else {
                boolean destroyed = false ;
                while(!st.isEmpty()&&st.peek()>0){
                    if(Math.abs(a[i])>st.peek()){
                        st.pop();
                    }else if(Math.abs(a[i])==st.peek()){
                        destroyed  = true ;
                        st.pop();
                        break ;
                        }else{
                            destroyed = true ;
                        break;
                    }
                }
                if(!destroyed && (st.isEmpty()|| st.peek()<0)){
                    st.push(a[i]);
                }
            }
        }
        int[] res = new int[st.size()];
        for(int i = res.length-1 ; i>=0 ; i-- ){
            res[i] = st.pop();
        }
        return res ;
    }
}