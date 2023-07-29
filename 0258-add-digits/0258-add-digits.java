class Solution {
    public int addDigits(int n) {
        int sum=0;
    //     // int n=nums;
     while(n!=0){
        sum+=n%10;
        n=n/10;
        if(n==0&&sum>9){
            n=sum;
            sum=0;
        }
        }
    return sum;
    }
}