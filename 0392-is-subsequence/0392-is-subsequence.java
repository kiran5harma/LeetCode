class Solution {
    public boolean isSubsequence(String ss, String tt) {
        if(ss.length()<1)
        {return true;}
        char s[]=ss.toCharArray();
        char t[]=tt.toCharArray();
        int j=0;
        for(int i=0;i<t.length;i++){
            if ((s.length>0)&&(t[i]==s[j])){
                j++;
            }
            if(j==s.length)
            return true;
        }
        return false;
    }
}