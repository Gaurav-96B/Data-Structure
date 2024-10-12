class Solution {
    int countTriplet(int arr[], int n) {
         Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>=2;i--){
            int start=0;
            int end=n-1;
            while(start<end){
                if(arr[start]+arr[end]==arr[i]){
                    count++;
                    start++;
                    end--;
                }
                else if(arr[start]+arr[end]<arr[i]){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return count;
    }
}
