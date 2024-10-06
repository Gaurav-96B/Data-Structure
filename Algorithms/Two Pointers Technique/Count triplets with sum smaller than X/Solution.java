class Solution {
    long countTriplets(int n, int sum, long arr[]) {
      Arrays.sort(arr);
      int count=0;
      for(int i=0;i<n-2;i++){
          int start=i+1;
          int end=n-1;
          while(start<end){
              if(arr[start]+arr[end]+arr[i]<sum){
                  count=count+(end-start);
                  start++;
              }
              else if(arr[start]+arr[end]+arr[i]>=sum){
                  end--;
              }
          }
      }
      return count;
    }
}
