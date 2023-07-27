class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int j=0,sum=0;
        while(j<nums.length){
           
            if(sum < 0 && nums[j] >= sum){
                sum = 0;
                
            }
             sum += nums[j];
            max = Math.max(max , sum);
            j++;
        }  
        return max;
    }
}