/*The same number may be chosen from candidates an unlimited number of times*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combinationSum(candidates, ans, curr, target, 0);
        return ans;
    }

    public void combinationSum(int candidates[], List<List<Integer>> ans, List<Integer> curr, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            curr.add(candidates[i]);
            combinationSum(candidates, ans, curr, target - candidates[i], i);
            curr.remove(curr.size() - 1);

        }
    }

}
