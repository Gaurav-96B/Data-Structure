/*Given an integer array nums of unique elements and the solution set must not contain duplicate subsets*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        powerSet(nums, ans, curr, 0);
        return ans;

    }

    public void powerSet(int nums[], List<List<Integer>> ans, List<Integer> curr, int start) {
        ans.add(new ArrayList<>(curr));
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            powerSet(nums, ans, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }

}
