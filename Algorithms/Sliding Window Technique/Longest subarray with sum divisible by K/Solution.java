class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
       Map<Integer,Integer>map=new HashMap<>();
       int sum=0;
       int maxLen=0;
       int mod=0;
       for(int i=0;i<n;i++){
           sum=sum+a[i];
	   mod=((sum % k) + k) % k;
           if(mod==0){
              maxLen=i+1; 
           }
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
