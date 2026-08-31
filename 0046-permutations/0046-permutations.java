class Solution {
        
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        func(nums, new ArrayList<>());
        return ans;
    }
    public void func(int[] nums, List<Integer> k) {
        if (k.size() == nums.length) {
            ans.add(new ArrayList<>(k));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (k.contains(nums[i]))
                continue;
            k.add(nums[i]);
            func(nums, k);
            k.remove(k.size() - 1);
        }
    }
}