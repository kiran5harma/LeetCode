class MyStack {
    int []arr;
    int front;
    int rear;

    public MyStack() {
       arr=new int[100];
        front=0;
        rear=0;
    }
    
    public void push(int x) {
        if(rear==100)
            return;
        else{
            arr[rear]=x;
            rear++;
        }
        
    }
    
    public int pop() {
        if(rear==0)
            return -1;
        else{
            int t=arr[rear-1];
            rear--;
            return t;
        }
        
    }
    
    public int top() {
        if(rear==0)
            return -1;
        else{
            int t=arr[rear-1];
            return t; 
        }
        
    }
    
    public boolean empty() {
        if(rear==0)
            return true;
        else
            return false;
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