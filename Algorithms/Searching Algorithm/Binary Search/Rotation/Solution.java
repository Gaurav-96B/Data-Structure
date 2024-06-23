class Solution {
    int findKRotation(int arr[], int n) {
        int start=0;
        int mid=0;
        int end=n-1;
        if(arr[start]<arr[end]){
            return 0;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid>0&&arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(mid<n-1&&arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return 0;
    }
}
