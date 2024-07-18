class Solution{
    static boolean recreationalSpot(int[] arr , int n){
        if(n<3){
            return false;
        }
        Stack<Integer> st=new Stack<>();
        int third=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<third){
                return true;
            }
          while (!st.isEmpty() && st.peek()<arr[i]) {
                third=st.pop();
              
          }
              st.push(arr[i]);
        }
        return false;
    }
};
