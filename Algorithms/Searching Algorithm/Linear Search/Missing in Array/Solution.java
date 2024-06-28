class Solution {
    int missingNumber(int n, int arr[]) 
    {
        int totalSum=(n*(n+1))/2;
        int arraySum=0;
        
        for(int i=0;i<n-1;i++){
            arraySum=arraySum+arr[i];
        }
        
        return(totalSum-arraySum);
    }
}
