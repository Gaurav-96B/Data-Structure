class Solution {
    public ArrayList < ArrayList < Integer >> UniquePartitions(int n) {
        int index = 0;
        int nums[] = new int[n];
        for (int i = n; i >= 1; i--) {
            nums[index++] = i;

        }
        ArrayList < ArrayList < Integer >> ans = new ArrayList < > ();
        ArrayList < Integer > curr = new ArrayList < > ();

        combinationSum(nums, ans, curr, n, 0);
        return ans;

    }

    public void combinationSum(int nums[], ArrayList < ArrayList < Integer >> ans, ArrayList < Integer > curr, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList < > (curr));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) {
                continue;
            }
            curr.add(nums[i]);
            combinationSum(nums, ans, curr, target - nums[i], i);
            curr.remove(curr.size() - 1);
        }
    }
}
