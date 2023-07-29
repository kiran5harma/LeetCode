class Solution {
    public int arrayPairSum(int[] n) {
       Arrays.sort(n);
        // int l=0;
        // imt r=n.length-1;
        // for(int i=0;i<n.length;i++){
        //     if(n[l]>)
        // }
       int sum=0;
       for(int i=0;i<n.length-1;i+=2){
           if(n[i]<n[i+1])
            sum+=n[i];
            else
            sum+=n[i+1];
       } 
       return sum;
    }
}