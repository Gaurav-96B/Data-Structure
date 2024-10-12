class Solution {
    boolean twoSum(int arr[], int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])==true){
                return true;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return false;
    }
}
