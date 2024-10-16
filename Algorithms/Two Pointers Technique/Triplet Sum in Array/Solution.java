class Solution {
    public static boolean find3Numbers(int A[], int n, int X) {
      Arrays.sort(A);
      for(int i=0;i<n;i++){
          int start=i+1;
          int end=n-1;
          while(start<end){
              if(A[start]+A[end]+A[i]==X){
                  return true;
              }
              else if(A[start]+A[end]+A[i]<X){
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
