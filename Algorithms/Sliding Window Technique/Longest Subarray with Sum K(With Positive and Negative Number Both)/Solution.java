class Solution {
    public static int lenOfLongSubarr(int A[], int n, int k) {
      Map<Integer,Integer>map=new HashMap<>();
      int prefixSum=0;
      int maxLen=0;
      for(int i=0;i<n;i++){
          prefixSum=prefixSum+A[i];
          if(prefixSum==k){
              maxLen=i+1;
          }
          if(map.containsKey(prefixSum-k)==true){
              maxLen=Math.max(maxLen,i-map.get(prefixSum-k));
          }
          if(map.containsKey(prefixSum)==false){
              map.put(prefixSum,i);
          }
      }
      return maxLen;
    }
}
