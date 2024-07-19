class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        
        int max=Integer.MIN_VALUE;
        int frequency=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer>mp:map.entrySet()){
            if(mp.getKey()>max&&mp.getValue()<=frequency){
                    max=mp.getKey();
                    frequency=mp.getValue();
                }
            }
        return max;
    }
}
