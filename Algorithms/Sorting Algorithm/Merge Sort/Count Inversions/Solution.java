class Solution {
    static long inversionCount(long arr[], int n) {
        // Count the number of pairs
        return mergeSort(arr,0,n-1);
    }
    
    static long mergeSort(long arr[], int start, int end)
    {
        long count=0;
        if(start>=end){
            return count;
        }
            int mid=start + (end-start) / 2;
            count=count+mergeSort(arr, start, mid);
            count=count+mergeSort(arr, mid + 1, end);
            count=count+merge(arr, start, mid, end);
            return count;
    }

    static long merge(long arr[], int start, int mid, int end)
     {
        int left=start;
        int right=mid+1;
        long temp[] = new long[end-start+1];
        int k=0;
        long count=0;
        while(left<=mid && right<=end){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                k++;
                left++;
            }
            else{
                temp[k]=arr[right];
                count=count+(mid-left+1);
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

        for(int i=0; i<temp.length;i++){
            arr[start+i]=temp[i];
        }
        return count;
    }

  }
