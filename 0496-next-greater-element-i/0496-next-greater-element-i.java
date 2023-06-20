class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     
        int n= nums1.length;
        int m= nums2.length;   
        
        int ans []=new int[n];
        
        if(n==1&&m==1&&(nums1[0]==nums2[0])){
            ans[0]=-1;
            return ans;
        }
         for(int i=0;i<n;i++){
             for(int j=0;j<m-1;j++){
                 
                 if(nums1[i]==nums2[m-1])
                 ans[i]=-1;
                 
                 if(nums1[i]==nums2[j]){
                     
                     for(int k=j+1;k<m;k++)
                     if(nums1[i]<nums2[k])
                     {ans[i]=nums2[k];
                      break;}
                     else
                         ans[i]=-1;
        
                 }
                 
             }
         }
        //  if(nums1[nums1.length-1]==nums2[nums2.length-1])
        //  ans[nums1.length-1]=-1;
         return ans;
        
//         Stack<Integer> s = new Stack<Integer>();
//         int n= nums1.length;
//         int m= nums2.length;
        
//         for(int i=0;i<m;i++){
//             s.push(nums2[i]);
//         }
        
//         int ans[]=new int[n];
        
//         for(int e:nums1){
//             while(!s.empty&&s.peek()<e){
//                 int k = s.pop();
                
//             }
            
//         }
    }
}