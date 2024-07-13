class Solution {
    public int print2largest(List<Integer> arr) {
        int firstLargest=arr.get(0);
        int secondLargest=-1;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr.get(i);
            }
            else if(arr.get(i)<firstLargest && arr.get(i)>secondLargest){
                secondLargest=arr.get(i);
            }
        }
        return secondLargest;
    }
}
