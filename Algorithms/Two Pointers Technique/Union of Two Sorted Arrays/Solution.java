class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
       ArrayList<Integer>ans=new ArrayList<>();
       int i=0;
       int j=0;
       while(i<n&&j<m){
           if(arr1[i]<arr2[j]){
               if(ans.size() > 0 && ans.get(ans.size()-1) == arr1[i]){
                   i++;
               }
               else{
               ans.add(arr1[i]);
               i++;
               }
           }
           else if(arr1[i]>arr2[j]){
               
               if(ans.size() > 0 && ans.get(ans.size()-1) == arr2[j]){
                   j++;
               }
               else{
               ans.add(arr2[j]);
               j++;
             }
           }
           else{
               if(ans.size() > 0 && ans.get(ans.size()-1) == arr1[i]){
                   i++;
                   j++;
               }
               else{
               ans.add(arr1[i]);
               i++;
               j++;
              }
           }
       }
       
       while(i<n){
           if(ans.size() > 0 && ans.get(ans.size()-1) == arr1[i]){
                   i++;
               }
           else{
           ans.add(arr1[i]);
           i++;
           }
       }
       
       while(j<m){
           if(ans.size() > 0 && ans.get(ans.size()-1) == arr2[j]){
                   j++;
               }
           else{
           ans.add(arr2[j]);
           j++;
           }
       }
       return ans;
    }
}

