class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       ArrayList<Integer>ans=new ArrayList<>();
       int sum=0;
       int startIndex=0;
       for(int endIndex=0;endIndex<n;endIndex++){
           sum=sum+arr[endIndex];
           while(startIndex<endIndex&&sum>s){
               sum=sum-arr[startIndex];
               startIndex++;
           }
           if(sum==s){
               ans.add(startIndex+1);
               ans.add(endIndex+1);
               return ans;
           }
           
       }
       ans.add(-1);
       return ans;
    }
}
