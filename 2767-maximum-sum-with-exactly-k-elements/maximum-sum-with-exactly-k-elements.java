class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int largest = nums[nums.length - 1];
        for(int i=1; i<=k; i++) {
            sum += largest;
            largest += 1;
        }
        return sum;
    }
}