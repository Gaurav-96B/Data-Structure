/*Given an integer array nums of duplicate elements and the solution set must not contain duplicate subsets*/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        buildSubset(nums, ans, curr, 0);
        return ans;

    }

    public void buildSubset(int nums[], List<List<Integer>> ans, List<Integer> curr, int startIndex) {
        ans.add(new ArrayList<>(curr));
        for (int i = startIndex; i < nums.length; i++) {
            if (i != startIndex && nums[i] == nums[i - 1]) {
                continue;
            }
            curr.add(nums[i]);
            buildSubset(nums, ans, curr, i + 1);
            curr.remove(curr.size() - 1);

        }
    }
}
