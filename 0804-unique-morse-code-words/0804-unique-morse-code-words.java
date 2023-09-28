class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<String> (); 
        String ans ="";
        for(String str: words){
            ans="";
            for(int j=0;j<str.length();j++){
                
                int value = str.charAt(j);
                ans+=arr[value-97];
            }   
              
            set.add(ans);
        }
        
        return set.size();
    }
}