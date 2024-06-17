class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        Arrays.sort(a);
        Arrays.sort(b);
        int start=0;
        int end=0;
        int count=0;
        while(start<n&&end<m){
            if(a[start]<b[end]){
                start++;
            }
            else if(a[start]>b[end]){
                end++;
            }
            else{
                count++;
                start++;
                end++;
                
               while(start<n && a[start]==a[start-1]){
               start++;
             }
              while(end<m && b[end]==b[end-1]){
              end++;
             }
                
          }
        }
        
        return count;
    }
}
