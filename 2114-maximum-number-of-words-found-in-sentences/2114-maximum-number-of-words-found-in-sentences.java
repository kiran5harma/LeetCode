class Solution {
    public int mostWordsFound(String[] sen) {
        int count=1;
        int max=0;
        for(int i=0;i<sen.length;i++){
            count=1;
            for (int j=0;j<sen[i].length();j++){
                if(sen[i].charAt(j)==' ')
                    count++;
            }
            if(max<count)
                max=count;
        }
        return max;
    }
}