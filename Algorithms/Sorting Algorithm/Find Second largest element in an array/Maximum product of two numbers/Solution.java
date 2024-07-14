class Solution {
    int maxProduct(int arr[], int n) {
        int firstLargest=arr[0];
        int secondLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            else if(arr[i]<=firstLargest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return firstLargest*secondLargest;
    }
}
