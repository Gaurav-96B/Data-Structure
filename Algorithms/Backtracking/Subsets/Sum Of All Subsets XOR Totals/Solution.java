class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        buildSubset(nums, ans, curr, 0);

        int sum = 0;
        for (List<Integer> first : ans) {
            int xor = 0;
            for (int value : first) {
                xor = xor ^ value;
            }
            sum = sum + xor;
        }
        return sum;
    }

    public void buildSubset(int nums[], List<List<Integer>> ans, List<Integer> curr, int startIndex) {

        ans.add(new ArrayList<>(curr));
        for (int i = startIndex; i < nums.length; i++) {
            curr.add(nums[i]);
            buildSubset(nums, ans, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
        return;
    }

}
