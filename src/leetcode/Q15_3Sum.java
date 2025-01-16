package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q15_3Sum {
    public static List<List<Integer>> threeSumBrut(int[] nums) {

        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> subArr = new ArrayList<>();
                        subArr.add(nums[i]);
                        subArr.add(nums[j]);
                        subArr.add(nums[k]);
                        Collections.sort(subArr);
                        if (!arr.contains(subArr)) arr.add(subArr);
                    }

                }

            }

        }

        return arr;
    }

//    public static List<List<Integer>> random(int[] num){
////        return arr;
//    }


    public static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {

            int j = i + 1, k = n - 1;

            while (j < k) {
                int trip = nums[i] + nums[j] + nums[k];
                if (trip == 0) {
                    List<Integer> subArr = new ArrayList<>();
                    subArr.add(nums[i]);
                    subArr.add(nums[j]);
                    subArr.add(nums[k]);
                    Collections.sort(subArr);
                    if (!arr.contains(subArr)) arr.add(subArr);
                    j++;
                } else if (trip < 0) {
                    j++;
                } else {
                    k--;
                }
            }


        }


        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -3, -2, -1, -1, 0, 0, 1, 2, 3, 4};
        System.out.println(threeSumBrut(nums));
        System.out.println(threeSum(nums));
    }
}
