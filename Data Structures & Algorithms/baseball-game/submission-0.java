class Solution {
    public int calPoints(String[] operations) {
        int count = 0 ; 
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0 ; i<operations.length ; i++){
            if(operations[i].equals("+")){
                int last  = st.pop();
                int secLast =  st.pop();
                int res =  last+secLast ;
                st.push(secLast);
                st.push(last);
                st.push(res);
                count += res ;
                continue;
            }else if(operations[i].equals("D")){
                st.push(2*st.peek());
                count += st.peek();
                continue ;
            }else if(operations[i].equals("C")){
                int rev = st.pop();
                count -= rev ;
                continue ;
            }else{
                st.push(Integer.parseInt(operations[i]));
                count += st.peek();
            }
        }
        return count ; 
    }
}