class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    
        int min = Integer.MAX_VALUE;
        char ans=' ';
        int t = target;
        for(int ch:letters){
            int temp=ch-t;
            if(min>temp && temp>0){
                min = temp;
                ans = (char)ch;
            }
        }
        if(ans==' ')
            return letters[0];
        else
            return ans;
    }
}