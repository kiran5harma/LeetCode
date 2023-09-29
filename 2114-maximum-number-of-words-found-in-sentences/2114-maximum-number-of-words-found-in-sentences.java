class Solution {
    public int mostWordsFound(String[] sen) {
        int max=0;
        
        for(String str : sen){
            int len = str.split(" ").length;
            
            // for (int j=0;j<sen[i].length();j++){
            //     if(sen[i].charAt(j)==' ')
            //         count++;
            // }
          
            if(max<len)
                max=len;
        }
        return max;
    }
}