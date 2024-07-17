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
    
    public int getMaxArea(int hist[],int n) 
    {
        Stack<Integer> s = new Stack<>();
        int maxArea=0;
        for (int i=0;i<=n; i++) {
            int h=(i==n)?0:hist[i];
            while (!s.isEmpty() && hist[s.peek()] > h) {
                int ele=s.pop();
                int nse=i;
                int pse=s.isEmpty()?-1:s.peek();
                maxArea=Math.max(hist[ele]*(nse - pse - 1),maxArea);
            }
            s.push(i);
        }
        return maxArea;
  }
}

