class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
        return 0;
        int max=amount+1;
        int arr[]=new int[amount+1];
        Arrays.fill(arr,max);
        arr[0]=0;
        for(int i=1;i<max;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    arr[i]=Math.min(arr[i],arr[i-coins[j]]+1);
                }
            }
        }

        if(arr[amount]==max)
        return -1;
        else
        return arr[amount];

    }
}