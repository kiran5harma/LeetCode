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
        
        //Optimal...12MS
        
        Arrays.sort(nums);
        int m1 = nums[0]*nums[1]*nums[n-1];
        int m2 = nums[n-1]*nums[n-2]*nums[n-3];
        
        if(m1>m2)
            return m1;
        else 
            return m2;
        
        //Again..how deep is your lovee............15 MS -_- 
        
//         int max[] = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
//         int min[] = {Integer.MAX_VALUE,Integer.MAX_VALUE};
        
//         for(int i=0;i<n;i++){
//             if(nums[i]>max[0]){
//                 max[2]= max[1];
//                 max[1]= max[0];
//                 max[0]= nums[i];
//             }
//             else if(nums[i]>max[1]){
//                 max[2]= max[1];
//                 max[1]= nums[i];
//             }
//             else if(nums[i]>max[2])
//                 max[2]= nums[i];
            
//             if(nums[i]<min[0]){
//                 min[1]= min[0];
//                 min[0]= nums[i];
//             }
//             else if(nums[i]<min[1])
//                 min[1]= nums[i];
//         }
        
//         System.out.println(max[0]+" "+max[1]+" "+max[2]);
//         System.out.println(min[0]+" "+min[1]);
        
//         int m1 = max[0]*max[1]*max[2];
//         int m2 = min[0]*min[1]*max[0];
        
//         return m1>m2?m1:m2;
        
    }
}