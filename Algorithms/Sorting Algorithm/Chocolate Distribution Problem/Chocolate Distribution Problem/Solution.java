class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long diff = Integer.MAX_VALUE;
        for(int i = 0 ; i <= n-m ; i++){
            diff = Math.min(diff,a.get(i+m-1) - a.get(i));
        }
        return diff;
    }
}
