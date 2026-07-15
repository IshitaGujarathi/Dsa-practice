class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0, i=0;
        for( i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[s];
                nums[s] = temp;
                s++;
            }
        }
    }
}