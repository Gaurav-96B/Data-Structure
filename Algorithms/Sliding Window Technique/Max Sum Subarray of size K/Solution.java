class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int n){
        long sum=0;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+Arr.get(i);
            if(i>=K-1){
               max=Math.max(max,sum);
               sum=sum-Arr.get(i-(K-1));
            }
        }
       return max;
    }
}
