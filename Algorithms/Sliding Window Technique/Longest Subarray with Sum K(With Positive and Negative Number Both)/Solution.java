class Solution{
    public static int lenOfLongSubarr (int A[], int N, int K) {
       Map<Integer,Integer>map=new HashMap<>();
       map.put(0,-1);
       int sum=0;
       int maxLen=0;
       for(int i=0;i<N;i++){
           sum=sum+A[i];
           if(map.containsKey(sum-K)==true){
               maxLen=Math.max(maxLen,i-map.get(sum-K));
           }
           if(map.containsKey(sum)==false){
               map.put(sum,i);
           }
       }
       return maxLen;
    }
}
