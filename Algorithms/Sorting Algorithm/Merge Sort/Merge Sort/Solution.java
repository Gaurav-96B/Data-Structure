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
        int left=start;
        int right=mid+1;
        int temp[]=new int[end-start + 1];
        int k=0;
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
       
        while(left<=mid){
            temp[k]=arr[left];
            k++;
            left++;
        }

        while(right<=end){
            temp[k]=arr[right];
            k++;
            right++;
        }
        
        for(int i=0;i<temp.length;i++){
            arr[start+i]=temp[i];
        }
    }
}
