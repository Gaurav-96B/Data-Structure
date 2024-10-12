class Solution
{
    static int findSubArraySum(int arr[], int n, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int count=0;
        int prefixSum=0;
        for(int i=0;i<n;i++){
            prefixSum=prefixSum+arr[i];
            if(prefixSum==k){
                count++;
            }
            if(map.containsKey(prefixSum-k)){
                 count=count+map.get(prefixSum-k);
            }
            if(map.containsKey(prefixSum)==false){
                 map.put(prefixSum,1);

            }
            else{
                map.put(prefixSum,map.get(prefixSum)+1);
            }
        }
        return count;
    }
}
