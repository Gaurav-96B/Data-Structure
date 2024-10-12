class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
      ArrayList<Integer>ans=new ArrayList<>();
      int prefixSum=0;
      int startIndex=0;
      for(int endIndex=0;endIndex<n;endIndex++){
          prefixSum=prefixSum+arr[endIndex];
          while(startIndex<endIndex&&prefixSum>s){
              prefixSum=prefixSum-arr[startIndex];
              startIndex++;
          }
          if(prefixSum==s){
              ans.add(startIndex+1);
              ans.add(endIndex+1);
              return ans;
          }
      }
       ans.add(-1);
       return ans;
    }
}
