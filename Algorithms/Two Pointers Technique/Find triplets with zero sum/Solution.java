class Solution
{
 public boolean findTriplets(int A[] , int n)
    {
      Arrays.sort(A);
      for(int i=0;i<n;i++){
          int start=i+1;
          int end=n-1;
          while(start<end){
              if(A[start]+A[end]+A[i]==0){
                  return true;
              }
              else if(A[start]+A[end]+A[i]<0){
                  start++;
              }
              else{
                  end--;
              }
          }
      }
      return false;
    }
}
