class Solution {
    int countZeroes(int[] arr, int n) {
        int start=0;
        int mid=0;
        int end=n-1;
        int firstIndex=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==0){
                firstIndex=mid;
                end=mid-1;
            }
            else if(arr[mid]>0){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return n-firstIndex;
    }

}
