class Solution {
    public int pivotIndex(int[] nums) {
       int sum=0;
       for(int e:nums){
           sum+=e;
       }
       int ls=0;
       for(int i=0;i<nums.length;i++){
           
           sum=sum-nums[i];
           if(ls==sum)
           return i;
           ls+=nums[i];
       }
       return -1;
    }
}