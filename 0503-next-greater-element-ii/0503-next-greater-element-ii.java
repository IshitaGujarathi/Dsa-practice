class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] NGE = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            while (!st.isEmpty() && st.peek() <= nums[index]) {
                st.pop();
            }

            if (st.isEmpty()) {
                NGE[index] = -1;
            } else {
                NGE[index] = st.peek();
            }

            st.push(nums[index]);
        }

        return NGE;
    }
}