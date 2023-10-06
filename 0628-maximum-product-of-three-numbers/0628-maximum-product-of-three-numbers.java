class Solution {
    public int maximumProduct(int[] nums) {
        
        // int max = Integer.MIN_VALUE;
        int n = nums.length;
        
        if(n==3)
            return nums[n-1]*nums[n-2]*nums[n-3];
        
        //TLE..............................................
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
        //             int pro = nums[i]*nums[j]*nums[k];
        //             if(max<pro)
        //                 max = pro;
        //         }
        //     }
        // }
        // return max;
        
        //Optimal
        
        Arrays.sort(nums);
        int m1 = nums[0]*nums[1]*nums[n-1];
        int m2 = nums[n-1]*nums[n-2]*nums[n-3];
        
        if(m1>m2)
            return m1;
        else 
            return m2;
        
    }
}