class Solution {
    public void heapSort(int arr[]) {
        buildMaxHeap(arr,arr.length);
        for (int i=arr.length-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,0,i);
        }
    }
    public void buildMaxHeap(int arr[],int n){
        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,i,n);
        }
    }
    public void heapify(int arr[],int i,int n){
        int l=2*i+1;
        int r=2*i+2;
        int largest=i;
        if(l<n&&arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n&&arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,largest,n);
        }
    }
}
