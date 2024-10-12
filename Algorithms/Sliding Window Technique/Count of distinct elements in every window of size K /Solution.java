class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
       ArrayList<Integer>ans=new ArrayList<>();
       Map<Integer,Integer>map=new HashMap<>();
       int startIndex=0;
       for(int i=0;i<n;i++){
           if(map.containsKey(A[i])==false){
               map.put(A[i],1);
           }
           else{
               map.put(A[i],map.get(A[i])+1);
           }
                         OR
           map.put(A[i],map.getOrDefault(A[i],0)+1);  
           
           if(i>=k-1){
               ans.add(map.size());
               if(map.get(A[startIndex])==1){
                   map.remove(A[startIndex]);
               }
               else{
                   map.put(A[startIndex],map.get(A[startIndex])-1);
               }
               startIndex++;
           }
           
       }
       return ans;
    }
}

