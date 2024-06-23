class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        int firstIndex=lb(arr,n,x);
        int lastIndex=ub(arr,n,x);
        
        ArrayList<Integer>ans=new ArrayList<>();
        if(firstIndex==-1&&lastIndex==-1){
            ans.add(-1);
            return ans;
        }
        ans.add(firstIndex);
        ans.add(lastIndex);
        return ans;
    }
    
    public int lb(int arr[],int n,int x)
    {
        int start=0;
        int mid=0;
        int end=n-1;
        int index=-1;
        while(start<=end) {
            mid=start+(end-start)/2;
            if(arr[mid]==x){
               index=mid;
               end=mid-1;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index;
    }
    
    public int ub(int arr[],int n,int x)
    {
        int start=0;
        int mid=0;
        int end=n-1;
        int index=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==x){
               index=mid;
               start=mid+1;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index;
}
}

