class Solution {
    int remove_duplicate(int A[],int N){
        int start=0;
        int end=start+1;
        while(end<N){
            if(A[start]!=A[end]){
                start++;
                A[start]=A[end];
                end++;
            }
            else{
                end++;
            }
        }
        return start+1;
    }
}
