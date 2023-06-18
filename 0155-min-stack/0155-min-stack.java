class MinStack {
    
    Stack<Integer> s;
    Stack<Integer> mini;

    public MinStack() {
        s=new Stack<Integer>();
        mini = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(s.size()==0){
            s.push(val);
            mini.push(val);
        }
        else{
            s.push(val);
            if(val<mini.peek())
                mini.push(val);
            else
                mini.push(mini.peek());
        }
    }
    
    public void pop() {
        s.pop();
        mini.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */