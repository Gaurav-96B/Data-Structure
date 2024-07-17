class Solution
{
    public static long getMaxArea(long arr[], long n) 
    {
        int rightsmaller[]=getRightSmaller(arr);
        int leftsmaller[]=getLeftSmaller(arr);
        long maxArea=Long.MIN_VALUE;
        for (int i=0;i<n; i++) {
            maxArea=Math.max(maxArea,(arr[i]*(rightsmaller[i]-leftsmaller[i]-1)));
        }
        return maxArea;
    }

    public  static int[] getLeftSmaller(long[] arr) {
        int len=arr.length;
        int result[]=new int[len];
        Stack<Integer> stack=new Stack<Integer>();
        for (int i=0; i<len; i++) {
            while (!stack.isEmpty() && arr[stack.peek()]>=arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
  
    public static int[] getRightSmaller(long [] arr) {
        int len=arr.length;
        int result[]=new int[len];
        Stack<Integer> stack=new Stack<Integer>();
        for (int i=len-1; i >=0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()]>=arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = len;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
        
}
