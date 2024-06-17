public class Solution {
    public int nTriang(ArrayList<Integer> A) {
      int n=A.size();
      Collections.sort(A);
      int count=0;
      for(int i=n-1;i>=2;i--){
          int start=0;
          int end=i-1;
          while(start<end){
              if(A.get(start)+A.get(end)>A.get(i)){
                  count=(count%1000000007)+((end-start)%1000000007);
                  end--;
              }
              else{
                  start++;
              }
          }
      }
      return count;
    }
}
