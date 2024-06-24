class Solution 
{ 
    static int Search(int arr[], int target)
	  {
	      int start=0;
        int mid=0;
        int end=arr.length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[start]<=arr[mid]){
                if(target>=arr[start]&&arr[mid]>target){
                    end=mid-1;
                }
                else{
                start=mid+1;
                }
            }
            else if(arr[mid]<=arr[end]) {
                if(target>arr[mid]&&arr[end]>=target){
                    start=mid+1;
                }
                else{
                end=mid-1;
                }
            }
        }
        return -1;
	}
} 


