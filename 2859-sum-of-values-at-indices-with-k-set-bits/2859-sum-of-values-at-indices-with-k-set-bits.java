class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count=0;
        int sum=0;
        
        for(int i=0;i<nums.size();i++){
            int n= i;
            count=0;
            while(n>0){
                count+=n&1;
                n=n>>1;
            }
            System.out.println(count+" "+i);
            if(count==k)
                sum+=nums.get(i);
        }
        return sum;
    }
}