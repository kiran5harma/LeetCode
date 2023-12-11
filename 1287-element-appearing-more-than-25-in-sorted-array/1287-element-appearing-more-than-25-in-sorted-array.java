class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int per = arr.length /4;
        for(int ele:arr){
            if (map.get(ele) == null){
                map.put(ele,1);
            }else{
                int val = map.get(ele) +1;
                map.put(ele,val);
            }
            if(map.get(ele)>per){
                return ele;
            }
        }
        return 0;
    }
}