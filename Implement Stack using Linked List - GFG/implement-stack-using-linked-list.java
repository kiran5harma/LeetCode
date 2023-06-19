//{ Driver Code Starts
import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}

// } Driver Code Ends


class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    MyStack(){
        
        top=null;
    }
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        if(top==null)
        top = new StackNode(a);
        
        // StackNode current=top;
        // while(current.next!=null){
        //     current=current.next;
        // }
        
        // StackNode temp = new StackNode(a);
        // if(temp==null)
        // return ;
        // current.next=temp;
        // temp.next=null;
        
        StackNode temp = new StackNode(a);
        temp.next=top;
        top=temp;
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        if(top==null||top.next==null)
        return -1;
        
        
        // StackNode current=top;
        
        // while(current.next.next!=null){
        //     current=current.next;
        // }
        
        // int val= current.next.data;
        // current.next=null;
        // return val;
        
        int val = top.data;
        top=top.next;
        return val;
        
    }
}
