class Solution {
    public int removeDuplicates(int[] n) {
        int index=1;
        for(int i=0;i<n.length-1;i++){
            if(n[i]<n[i+1]){
                n[index]=n[i+1];
                index++;
            }
        }
        return index;
    }
}