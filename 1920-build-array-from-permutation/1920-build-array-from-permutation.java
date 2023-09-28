class Solution {
    
    void index(int nums[],int i){
        if(i==nums.length)
            return ;
        int val=nums[nums[i]];
        index(nums,i+1);
        nums[i]=val;
    }
    public int[] buildArray(int[] nums) {
        // int []ans=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[nums[i]];
        // }
        // return nums;
        
        index(nums,0);
        return nums;
    }
}