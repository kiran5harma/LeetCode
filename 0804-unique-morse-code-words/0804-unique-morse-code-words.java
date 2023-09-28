class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<String> (); 
        String ans ="";
        for(int i=0;i<words.length;i++){
            ans="";
            for(int j=0;j<words[i].length();j++){
                int value = words[i].charAt(j);
                ans+=arr[value-97];
            }   
              
            set.add(ans);
        }
        
        return set.size();
    }
}