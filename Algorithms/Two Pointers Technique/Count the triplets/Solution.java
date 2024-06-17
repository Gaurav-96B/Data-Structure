class Solution {
    int countTriplet(int arr[], int n) {
        Arrays.sort(arr);
        int count=0;
        for(int targetIndex=n-1;targetIndex>=2;targetIndex--){
            int start=0;
            int end=targetIndex-1;
            while(start<end){
                if(arr[start]+arr[end]==arr[targetIndex]){
                    count++;
                    start++;
                    end--;
                }
                else if(arr[start]+arr[end]<arr[targetIndex]){
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
