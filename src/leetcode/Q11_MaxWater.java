package leetcode;

public class Q11_MaxWater {
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = 0;
        while (i < j) {
            int wid = j - i;
            int curArea = wid * Math.min(height[j], height[i]);
            if (curArea > maxArea) maxArea = curArea;

            // Math.max(wid*Math.min(height[j],height[i],maxArea)

            if (height[i] >= height[j]) j--;
            else i++;

        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 1};
        System.out.println(maxArea(height));
    }
}
