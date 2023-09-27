class Solution {
    public int differenceOfSum(int[] nums) {
        int se=0;
        int sd=0;
        for(int i=0;i<nums.length;i++){
            
            se += nums[i];
            
            if(nums[i]>9){
                while(nums[i]>0){
                    sd+=nums[i]%10;
                    nums[i]/=10;
                }
            }
            else{
                sd+=nums[i];
            }
        }
        
        if(sd>se)
            return sd-se;
        else
            return se-sd;
        
    }
}