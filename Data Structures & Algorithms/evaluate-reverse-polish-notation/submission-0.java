class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> set = new HashSet<String>();
        set.add("+");
        set.add("/");
        set.add("*");
        set.add("-");
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0 ; i <tokens.length ; i++){
            if(set.contains(tokens[i])){
                st.push(solve(st.pop(),st.pop(),tokens[i]));
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }

    private int solve(int b , int a, String sym){
        switch (sym) {
            case "+" :
                return a+b;
            case "-" :
                return a-b;
            case "*" :
                return a*b;
            case "/" :
                return a/b ;
            default :
                return 0;
        }
    }
}
