/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    //     int start=0;
    //     int end=n;
    //     while(start<=end){
    //         int mid=end+(start-end)/2;
    //         if(isBadVersion(mid)==true && isBadVersion(mid-1)==false) return mid;
    //         else if(isBadVersion(mid)==false) start=mid+1;
    //         else end=mid-1;
    //     }
    //  return -1;   
    int start=1;
    int end=n;
    while(start<end){
        int mid=start+(end-start)/2;
        if(isBadVersion(mid)){
end=mid;
        }
        else{
            start=mid+1;
        }
    }
    return start;
    }
    }
