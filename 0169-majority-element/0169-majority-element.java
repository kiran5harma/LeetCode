class Solution {
    public int majorityElement(int[] nums) {
    //  int max=0;
    //  int n=nums.length;
    //  for(int i=0;i<n;i++){
    //      if(max<nums[i])
    //      max=nums[i];
    //  }
    //  max++;
    //  int arr[]=new int[max];
    //  for(int i=0;i<max;i++){
    //      arr[i]=0;
    //  }
    //  for(int i=0;i<n;i++){
    //      arr[nums[i]]+=1;
    //  }
    //  n=max;
    //  max=0;
    //  for(int i=0;i<n;i++){
    //      if(arr[max]<arr[i])
    //      max=i;
    //  }
    //  return max;
    Arrays.sort(nums);
    return(nums[(nums.length)/2]);
    }
}