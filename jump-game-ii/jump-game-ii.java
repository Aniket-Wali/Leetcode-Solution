class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            int max = i;
            for (int j = 0; j <= max; j++) {
                if (j + nums[j] >= i) {
                    max = j;
                    dp[i] = dp[j] + 1;
                    break;
                }
            }
        }
        return dp[nums.length - 1];
    }
}