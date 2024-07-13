class Solution
{
    void mergeSort(int arr[],int start,int end)
    {
        if(start>=end){
            return;
        }
            int mid=start + (end-start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
    }
    
    void merge(int arr[], int start, int mid, int end)
     {
        int temp[]=new int[end-start + 1]; // temporary array
        int left=start;  // starting index of left half of arr
        int right=mid+1; // starting index of right half of arr
        int k=0;
         
        //storing elements in the temporary array in a sorted manner//
        while(left<=mid && right<=end){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                k++;
                left++;
            }
            else{
                temp[k]=arr[right];
                k++;
                right++;
            }
        }

        // if elements on the left half are still left //
        while(left<=mid){
            temp[k]=arr[left];
            k++;
            left++;
        }
         
        // if elements on the right half are still left //
        while(right<=end){
            temp[k]=arr[right];
            k++;
            right++;
        }

        // transfering all elements from temporary to arr //
        for(int i=0;i<temp.length;i++){
            arr[start+i]=temp[i];
        }
    }
}
