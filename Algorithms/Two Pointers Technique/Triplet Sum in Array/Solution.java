class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) 
    { 
      Arrays.sort(A);
      for(int i=n-1;i>=2;i--){
          int start=0;
          int end=i-1;
          while(start<end){
              if(A[start]+A[end]+A[i]==X){
                  return true;
              }
              else if(A[start]+A[end]+A[i]>X){
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
