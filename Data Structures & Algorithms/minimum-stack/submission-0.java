class MinStack {
    private Stack<Integer> st ;
    
    public MinStack() {
      st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> stt = new Stack<Integer>();
        int min = Integer.MAX_VALUE ;
        while(!st.isEmpty()){
            if(min>st.peek()){
                min  = st.peek();
            }
            stt.push(st.pop());
        }
        while(!stt.isEmpty()){
            st.push(stt.pop());
        }
        return min ;

    }
}
