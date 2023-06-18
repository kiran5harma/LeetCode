class MyQueue {
    Stack<Integer> s;

    public MyQueue() {
        s= new Stack<Integer>();
    }
    
    public void push(int x) {
        s.push(x);
    }
     
    int popBottom (Stack<Integer> s){
        if(s.size()==1){
            return s.pop();
        }
            int n = s.pop();
            int k=popBottom(s);
            s.push(n);
        
            return k;
    }
    public int pop() {
        return popBottom(s);
    }
    int Bottom (Stack<Integer> s){
        if(s.size()==1){
            return s.peek();
        }
            int n = s.pop();
            int k=Bottom(s);
            s.push(n);
        
            return k;
    }
    public int peek() {
        return Bottom(s);
        
    }
    
    public boolean empty() {
        return s.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */