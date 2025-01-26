package leetcode;

public class Q53_MaxSubarray {
    public static int kadneAlgo(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum < 0) currentSum = 0;
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] height = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] height = {5,4,-1,7,8};
        System.out.println(kadneAlgo(height));
    }
}
