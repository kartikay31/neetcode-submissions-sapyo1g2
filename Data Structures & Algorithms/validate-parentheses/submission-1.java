class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] ca = s.toCharArray();
        for(char c : ca){
            if(c == '('|| c == '{' || c == '['){
                st.push(c);
            }else if(c == ')' || c == '}' || c == ']'){
                if(st.isEmpty()){
                    return false ;
                }
                char cs = st.peek();
                if((cs== '(' && c == ')') || (cs== '{' && c == '}') || (cs== '[' && c == ']')){
                    st.pop();
                    continue ;
                }else{
                    return false ;
                }
            }
        }
       return st.isEmpty();
    }
}
