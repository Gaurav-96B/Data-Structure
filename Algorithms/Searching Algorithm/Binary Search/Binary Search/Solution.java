class Solution {
    int binarysearch(int arr[], int n, int k) {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
