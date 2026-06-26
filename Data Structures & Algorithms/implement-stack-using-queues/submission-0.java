class MyStack {
    private Deque<Integer> q  ;
    public MyStack() {
        q = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.offer(x);
        int i = q.size()-1 ;
        while(i>0){
            q.offer(q.poll());
            i-- ;
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */