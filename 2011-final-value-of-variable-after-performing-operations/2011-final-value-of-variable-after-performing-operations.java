class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        //Using HASHMAP---1ms solution
//         HashMap<String, Integer> map = new HashMap<String, Integer>();
//         map.put("--X",-1);
//         map.put("X--",-1);
//         map.put("++X",1);
//         map.put("X++",1);
        
//         int ans=0;
        
//         for(String op:operations){
//             ans+=map.get(op);
//         }
//         return ans;
        
        // 0ms
        int ans=0;
        for( String op: operations){
            ans+= 44 - op.charAt(1);
        }
        
        return ans;
        
    }
}