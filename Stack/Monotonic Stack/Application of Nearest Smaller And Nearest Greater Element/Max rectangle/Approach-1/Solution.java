class Solution {
    public int maxArea(int M[][], int n, int m) {
        int height[]=new int[m];
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j]==1){
                height[j]=height[j]+1;
                }
                else{
                    height[j]=0;
                }
            }
            int area=getMaxArea(height,m);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    
   public static int getMaxArea(int arr[], int n) 
    {
        int rightsmaller[]=getRightSmaller(arr);
        int leftsmaller[]=getLeftSmaller(arr);
        int maxArea=Integer.MIN_VALUE;
        for (int i=0;i<n; i++) {
            maxArea=Math.max(maxArea,(arr[i]*(rightsmaller[i]-leftsmaller[i]-1)));
        }
        return maxArea;
    }

    public  static int[] getLeftSmaller(int [] arr) {
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
  
    public static int[] getRightSmaller(int [] arr) {
        int len=arr.length;
        int result[]=new int[len];
        Stack<Integer> stack=new Stack<Integer>();
        for (int i=len-1;i>=0; i--) {
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
