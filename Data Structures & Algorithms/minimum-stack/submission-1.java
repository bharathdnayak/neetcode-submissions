class MinStack {
Stack<Integer> st = new Stack<>();      
Stack<Integer> minst = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()|| minst.peek()>=val){
            minst.push(val);
        }
    }
    
    public void pop() {
        if (st.isEmpty()) {
        return;
    }

    int val = st.pop();

    if (val == minst.peek()) {
        minst.pop();
    }
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minst.peek();
        
    }
}
