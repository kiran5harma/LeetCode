class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1=nums1.length;
        int n2=nums2.length;
        
        if(n1==0&&n2==1)
            return nums2[0];
        if(n2==0&&n1==1)
            return nums1[0];
        
        int []ans = new int[n1+n2];
        
        for(int i=0;i<n1;i++){
            ans[i]=nums1[i];
        }
        
        for(int i=0;i<n2;i++){
            ans[n1+i]=nums2[i];
        }
        
        Arrays.sort(ans);
        int j = n1+n2;
        int i = (n1+n2)/2;
        if(j%2==1){
            return ans[i];
        }
        else{
            double n = (float)(ans[i] + ans[i-1])/2;
            return n;
        }
    }
}