class Solution {
    int countBuildings(int h[], int n) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(h[i]>max){
                max=h[i];
                count++;
            }
        }
        return count;
    }
}
