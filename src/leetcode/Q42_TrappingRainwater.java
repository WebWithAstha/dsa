package leetcode;

import java.util.Arrays;

public class Q42_TrappingRainwater {
    public static int trap(int[] height) {
        int n = height.length;

        int[] left = new int[n];
        int maxLeft = 0;

        for (int i = 0; i < n; i++) {
            left[i] = Math.max(maxLeft, height[i]);
            if (height[i] > maxLeft) maxLeft = height[i];
        }
        int[] right = new int[n];
        int maxRight = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = Math.max(maxRight, height[i]);
            if (height[i] > maxRight) maxRight = height[i];
        }
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if ((Math.min(right[i], left[i]) - height[i]) > 0)
                ans += Math.min(right[i], left[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
    }

}
