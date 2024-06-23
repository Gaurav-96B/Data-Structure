class Solution {
    int transitionPoint(int arr[], int n) {
        int start=0;
        int mid=0;
        int end=n-1;
        int firstIndex=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==1){
                firstIndex=mid;
                end=mid-1;
            }
            else if(arr[mid]<1){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return firstIndex;
    }
}
