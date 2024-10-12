class Solution {
    int maxLen(int[] arr, int n)
    {
       Map<Integer,Integer>map=new HashMap<>();
       int prefixSum=0;
       int maxLen=0;
       for(int i=0;i<n;i++){
           prefixSum=(arr[i]==0)?(prefixSum-1):(prefixSum+1);
           if(prefixSum==0){
               maxLen=i+1;
           }
           if(map.containsKey(prefixSum)==true){
               maxLen=Math.max(maxLen,i-map.get(prefixSum));
           }
           if(map.containsKey(prefixSum)==false){
               map.put(prefixSum,i);
           }
       }
       return maxLen;
    }
}
