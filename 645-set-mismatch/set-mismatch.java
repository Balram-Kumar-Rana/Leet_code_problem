class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        int k = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans[k] = nums[i];
                    k++;
                    nums[i] = 0;
                    break;
                }
            }
        }
        int sum = n * (n + 1) / 2;
        int arrsum = 0;
        for (int i = 0; i < n; i++) {
            arrsum += nums[i];
        }
        arrsum = sum - arrsum;
        ans[k] = arrsum;

        return ans;

    }
}