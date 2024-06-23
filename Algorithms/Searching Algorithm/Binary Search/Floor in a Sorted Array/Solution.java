class Solution{
    static int findFloor(long arr[], int n, long x)
    {
        int start=0;
        int mid=0;
        int end=n-1;
        int floorIndex=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                floorIndex=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return floorIndex;
    }
}
