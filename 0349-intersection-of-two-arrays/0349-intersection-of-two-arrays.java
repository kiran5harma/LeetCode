class Solution {
    public int[] intersection(int[] n1, int[] n2) {
        
        HashSet <Integer> s1= new HashSet<>();
        for(int e:n1)
        s1.add(e);

        HashSet <Integer> s2= new HashSet<>();
        for(int e:n2)
        s2.add(e);

        HashSet <Integer> ans= new HashSet<>();
        for(Integer e:s1)
        if(s2.contains(e))
        ans.add(e);

        int [] res=new int[ans.size()];
        int i=0;
        for(Integer e:ans){
            res[i]=e;
            i++;
        }

    return res;
        
    }
}