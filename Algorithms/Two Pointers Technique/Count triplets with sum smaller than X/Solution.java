class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
      Arrays.sort(arr);
      int count=0;
      for(int i=n-1;i>=2;i--){
          int start=0;
          int end=i-1;
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
