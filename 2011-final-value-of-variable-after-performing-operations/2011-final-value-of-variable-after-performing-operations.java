class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("--X",-1);
        map.put("X--",-1);
        map.put("++X",1);
        map.put("X++",1);
        
        int ans=0;
        
        for(String op:operations){
            ans+=map.get(op);
        }
        return ans;
    }
}