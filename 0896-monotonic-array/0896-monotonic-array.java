class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc=0;
        int dec=0;
        int equ=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])
            dec++;
            else if(nums[i-1]<nums[i])
            inc++;
            else
            equ++;
            
        }
        if(dec+equ==nums.length-1)
        return true;
        else if(inc+equ==nums.length-1)
        return true;
        else
        return false;
    }
}