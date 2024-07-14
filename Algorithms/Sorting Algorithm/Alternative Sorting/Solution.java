class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        ArrayList<Long> res = new ArrayList<>();
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            res.add(arr[end]);
            end--;
            res.add(arr[start]);
            start++;
        }
        return res;
        
        
    }
}
