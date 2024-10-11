class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
       long sum=0;
       long max=Long.MIN_VALUE;
       int startIndex=0;
       for(int i=0;i<N;i++){
           sum=sum+Arr.get(i);
           if(i>=K-1){
               max=Math.max(max,sum);
               sum=sum-Arr.get(startIndex);
               startIndex++;
           }
       }
       return max;
    }
}
