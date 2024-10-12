class Solution {
      public pair[] allPairs( long arr1[], long arr2[], long N, long M, long x) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<pair> alt = new ArrayList<>();
        int start = 0;
        int end = arr2.length-1;
        while (start < N && end >= 0) {
            if (arr1[start] + arr2[end]<x) {
                 start++;
            } else if (arr1[start] + arr2[end] > x) {
               end--;
            } else {
                alt.add(new pair(arr1[start], arr2[end]));
                start++;
                end--;
            }
        }
       return alt.toArray(new pair[alt.size()]);
    }
}
