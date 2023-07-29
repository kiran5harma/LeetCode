class Solution {
    public int maxProfit(int[] prices) {
        //WRONG
        // int i=0,temp1=Integer.MAX_VALUE,index=-1;
        // for(;i<prices.length;i++){
        //     if(temp1>prices[i])
        //     {temp1=prices[i];
        //      index=i;
        //      }
        // }
        // int temp2=Integer.MIN_VALUE;
        // int check=-1;
        // for(i=index;i<prices.length;i++){
        //     if(temp2<prices[i])
        //     {temp2=prices[i];
        //     check++;
        //     }
        // }
        // if(check==-1)
        // return 0;
        // else
        // return temp2-temp1;

        //TLE
        // int max=Integer.MIN_VALUE;
        // int check=-1;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]<prices[j]&& max<prices[j]-prices[i])
        //         {max=prices[j]-prices[i];
        //         check++;
        //         }
        //     }
        // }
        // if(check==-1)
        // return 0;
        // else
        // return max;

        //OPTIMAL
        int min=prices[0];
        int maxp=0;
        int cost=0;
        for(int i=0;i<prices.length;i++){
            cost=prices[i]-min;
            if(maxp<cost)
            maxp=cost;
            if(min>prices[i])
            min=prices[i];
        }
        return maxp;
    }
}