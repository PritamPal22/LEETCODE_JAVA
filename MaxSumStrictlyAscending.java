public class MaxSumStrictlyAscending {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        System.out.println("The Maximum Ascending Subarray Sum is:" + Sum(nums));
    }

    public static int Sum(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                currSum = nums[0];
            } else {
                if (nums[i] > nums[i - 1]) {
                    currSum += nums[i];
                } else {
                    if (currSum > maxSum) {
                        maxSum = currSum;
                    }
                    currSum = nums[i];
                }
            }
        }

        if (currSum > maxSum) {
            maxSum = currSum;
        }

        return maxSum;
    }
}
