/*Each number in candidates may only be used once in the combination and the solution set must not contain duplicate combinations*/

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates, ans, curr, target, 0);
        return ans;

    }

    public void combinationSum(int nums[], List<List<Integer>> ans, List<Integer> curr, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i != start && nums[i] == nums[i - 1] || nums[i] > target) {
                continue;
            }
            curr.add(nums[i]);
            combinationSum(nums, ans, curr, target - nums[i], i + 1);
            curr.remove(curr.size() - 1);
        }
    }

}
