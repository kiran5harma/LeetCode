class Solution {
    public int findComplement(int num) {
        if(num==0)
            return 1;
        int count=0;
        count=(int)(Math.log(num)/Math.log(2))+1;
        
        int mask=(1<<count)-1;
        
        return mask^num;
    }
}