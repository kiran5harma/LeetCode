class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int ans[][]= new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=image[i][m-j-1];
                if(ans[i][j]==1)
                    ans[i][j]=0;
                else
                    ans[i][j]=1;
            }
        }
        return ans;
    }
}