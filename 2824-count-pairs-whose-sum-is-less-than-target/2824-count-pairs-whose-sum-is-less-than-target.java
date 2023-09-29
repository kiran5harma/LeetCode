class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count=0;
        
        for(int i=0;i<n;i++){
            // if(nums.get(i)>target)
            //     continue;
            for(int j=i+1;j<n;j++){
                if(nums.get(i)+nums.get(j)<target){
                    count++;
                    System.out.println(i+" "+j);
                }
            }
        }
        return count;
    }
}