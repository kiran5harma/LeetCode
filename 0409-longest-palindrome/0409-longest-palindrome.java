class Solution {
    public int longestPalindrome(String ss) {
        if(ss.length()<=1)
        return ss.length();
        HashSet<Character> set =new HashSet<>();
        char s[]=ss.toCharArray();
        int len=0;
        for(int i=0;i<s.length;i++){
            if(set.contains(s[i])){
                len+=2;
                set.remove(s[i]);
            }
            else{
                set.add(s[i]);
            }
        }
        if(set.size()>0)
        len++;
        return len;
    }
}