public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int start=0;
        int end=1;
        while(start<A.size()&&end<A.size()){
            if(start!=end && A.get(end)-A.get(start)==B){
                return 1;
            }
            else if(A.get(end)-A.get(start)<B){
                end++;
            }
            else{
                start++;
            }
        }
        return 0;
    }
}
