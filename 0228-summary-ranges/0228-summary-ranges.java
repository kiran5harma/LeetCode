class Solution {
    public List<String> summaryRanges(int[] nums) {
        // String [] list = new String

        List <String> list = new ArrayList<String>();

        if(nums.length==0)
        return list;

        Integer n1=nums[0];
        list.add(n1.toString());

        if(nums.length==1)
        return list;
        
        int index=0;
        for(int i=1;i<nums.length;i++){
            Integer n2=nums[i-1];
            Integer n3=nums[i];
            if(n2+1!=n3){
                if(!list.get(index).equals(n2.toString()))
                list.set(index,list.get(index)+"->"+n2.toString());
                index++;
                list.add(n3.toString()); 
            }
            
        }
        if(nums[nums.length-2]+1==nums[nums.length-1])
            {
                Integer n4=nums[nums.length-1];
                list.set(index,list.get(index)+"->"+n4.toString());
            }
       return list; 
    }
}