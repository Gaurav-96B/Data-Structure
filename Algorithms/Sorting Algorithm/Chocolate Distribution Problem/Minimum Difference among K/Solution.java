class Solution
{
    long minDiff(long a[] ,int N,int K){
        Arrays.sort(a);
        long diff=Integer.MAX_VALUE;
        for(int i=0;i <=N-K;i++){
            diff=Math.min(diff,a[i+K-1]-a[i]);
        }
        return diff;
    }
}
