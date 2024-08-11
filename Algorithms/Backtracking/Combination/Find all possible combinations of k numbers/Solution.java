class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int nums[] = new int[n];
        Arrays.setAll(nums, i -> i + 1);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combination(nums, ans, curr, k, 0);
        return ans;
    }

    public void combination(int nums[], List<List<Integer>> ans, List<Integer> curr, int k, int start) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            combination(nums, ans, curr, k, i + 1);
            curr.remove(curr.size() - 1);
        }
    }

}
