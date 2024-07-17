class Solution
{
    public static long getMaxArea(long hist[], long n) 
    {
        Stack<Integer> s = new Stack<>();
        long maxArea=0;
        for (int i=0;i<=n; i++) {
            long h=(i==n)?0:hist[i];
            while (!s.isEmpty() && hist[s.peek()] > h) {
                long ele=s.pop();
                long nse=i;
                long pse=s.isEmpty()? -1:s.peek();
                maxArea=Math.max(hist[(int) ele]*(nse - pse - 1),maxArea);
            }
            s.push(i);
        }
        return maxArea;
  }
}

