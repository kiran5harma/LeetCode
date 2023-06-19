class Solution {
    
    public int[] nextSmaller(int[] A,int n) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(-1);
        
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            int curr = A[i];
            while(s.peek()!=-1&&curr<=A[s.peek()]){
                s.pop();
            }
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }
    
     public int[] prevSmaller(int[] A,int n) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(-1);
        
         int ans[]= new int[n];
        for(int i=0;i<n;i++){
            int curr = A[i];
            while(s.peek()!=-1&&curr<=A[s.peek()]){
                s.pop();
            }
            ans[i]=s.peek();
            s.push(i);
        }
         
        return ans;
    }
    
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        
        int next[]=new int[n];
        next=nextSmaller(heights,n);
        
        int prev[]=new int[n];
        prev=prevSmaller(heights,n);
        
        // for(int i=0;i<n;i++){
        //     System.out.println(next[i]+" "+prev[i]);
        // }
        
        int area=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int l = heights[i];
            
            if(next[i]==-1){
                next[i]=n;
            }
            int b = next[i]-prev[i]-1;
            
            int newArea=l*b;
            area=Math.max(area,newArea);
        }
        return area;
    }
}