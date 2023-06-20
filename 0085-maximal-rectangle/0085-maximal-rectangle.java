class Solution {
    int[] nextSmall(int arr[],int n){
        Stack<Integer> s = new Stack<Integer>();
        s.push(-1);
        
        int ans[]=new int[n];
        
        for(int i=n-1;i>=0;i--){
            int cur=arr[i];
            
            while(s.peek()!=-1&&arr[s.peek()]>=cur)
                s.pop();
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }
    
    int[] prevSmall(int arr[],int n){
        Stack<Integer> s = new Stack<Integer>();
        s.push(-1);
        
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++){
            int cur=arr[i];
            
            while(s.peek()!=-1&&arr[s.peek()]>=cur)
                s.pop();
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }
    
    int maxArea(int []arr){
        
        int n=arr.length;
        
        int next[]=nextSmall(arr,n);
        int prev[]=prevSmall(arr,n);
        
        int area = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int l = arr[i];
            if(next[i]==-1)
                next[i]=n;
            int b=next[i]-prev[i]-1;
            
            area= Math.max(area,l*b);
        }
        return area;
    }
    public int maximalRectangle(char[][] matrix) {
       
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] mat = new int[row][col];
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == '1'){
                    mat[i][j] = 1;
                }else{
                    mat[i][j] = 0;
                }
            }
        }
        int area= maxArea(mat[0]);
        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    mat[i][j]+=mat[i-1][j];
                }
            }
            area=Math.max(area, maxArea(mat[i]));
            
        }
        return area;
    }
}