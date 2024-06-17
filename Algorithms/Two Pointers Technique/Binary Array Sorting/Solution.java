class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        int start=0;
        int end=N-1;
        while(start<end){
            if(A[start]>A[end]){
                int temp=A[start];
                A[start]=A[end];
                A[end]=temp;
                start++;
                end--;
            }
            else if(A[start]==0){
                start++;
            }
            else if(A[end]==1){
                end--;
            }
    }
  }
}


