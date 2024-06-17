class Solution
{
    //Function to find triplets with zero sum.
	 public boolean findTriplets(int arr[] , int n)
    {
      Arrays.sort(arr);
      int count=0;
      for(int i=n-1;i>=2;i--){
          int start=0;
          int end=i-1;
          while(start<end){
              if(arr[start]+arr[end]+arr[i]==0){
                  return true;
              }
              if(arr[start]+arr[end]+arr[i]>0){
                  end--;
              }
              else{
                  start++;
              }
          }
      }
      return false;
    }
}
