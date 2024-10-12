class Solution {
    int countPair(int k, int A[]) {
          int count=0;
          int start=0;
          int end=A.length-1;
          while(start<end){
              if(A[start]+A[end]==k){
                  count++;
                  start++;
                  end--;
              }
              else if(A[start]+A[end]>k){
                  end--;
              }
              else{
                  start++;
              }
          }
      return count;
    }
}
