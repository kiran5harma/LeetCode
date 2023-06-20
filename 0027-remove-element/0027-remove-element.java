class Solution {
    public int removeElement(int[] n, int val) {
        HashMap<Integer,Integer> set =new HashMap<>();
        int  size=n.length;
        
        int len=0;
        int index=0;
        for(int i=0;i<size;i++){
            
            if(n[i]==val){
                len++;
            }else{
                set.put(index,n[i]);
                index++;
            }
        }
        for(int i=0;i<size-len;i++){
            n[i]=set.get(i);
        }
        return size-len;
    }
}