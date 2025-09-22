class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for (int n : nums) {
            freq[n]++;
        }
        int max = 0;
        for (int f : freq) {
            if (f > max) max = f;
        }
        int res = 0;
        for (int f : freq) {
            if (f == max) res += f;
        }
        return res;
    }
}
