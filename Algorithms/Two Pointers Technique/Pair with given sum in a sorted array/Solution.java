class Solution{
    
    int Countpair(int a[], int n, int sum)
    {
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j){
            if(a[i]+a[j]==sum){
                count++;
                i++;
                j--;
            }
            else if(a[i]+a[j]<sum){
                i++;
            }
            else{
                j--;
            }
        }
        if(count==0){
            return -1;
        }
        return count;
    }
}
