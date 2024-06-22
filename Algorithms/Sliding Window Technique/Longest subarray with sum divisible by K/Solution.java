class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
       Map<Integer,Integer>map=new HashMap<>();
       map.put(0,-1);
       int sum=0;
       int maxLen=0;
       for(int i=0;i<n;i++){
           sum=sum+a[i];
	         int mod=((sum % k) + k) % k;
           if(map.containsKey(mod)==true){
               maxLen=Math.max(maxLen,i-map.get(mod));
           }
           if(map.containsKey(mod)==false){
               map.put(mod,i);
           }
       }
       return maxLen;
    }
}
