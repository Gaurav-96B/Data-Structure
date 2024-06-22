class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(A[i])==false){
                map.put(A[i],1);
            }
            else{
                map.put(A[i],map.get(A[i])+1);
            }
            if(i>=k-1){
                ans.add(map.size());
                if(map.get(A[i-(k-1)])==1){
                    map.remove(A[i-(k-1)]);
                }
                else{
                    map.put(A[i-(k-1)],map.get(A[i-(k-1)])-1);
                }
            }
        }
        return ans;
    }
}
