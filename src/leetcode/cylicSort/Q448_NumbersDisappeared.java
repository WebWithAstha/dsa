package leetcode.cylicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q448_NumbersDisappeared {

        public static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        // cylic sort
        //                 8
        //                 i

        // i+1
//              //  0
//              //  i
        //
//            1 //  3, 2, 3, 4, 8, 2, 7, 1
//            1 //  2, 3, 3, 4, 8, 2, 7, 1
//            1 //  3, 3, 2, 4, 8, 2, 7, 1
//            1 //  7, 3, 2, 4, 8, 2, 3, 1

//            1 //  4, 3, 2, 7, 8, 2, 3, 1
//                  0  1  2  3  4  5  6  7

        int i = 1;
        int n = nums.length;
        while (i < n) {
            if (nums[i - 1] != i) {
                if (nums[i - 1] != nums[nums[i - 1] - 1]) {
                    swap(nums, i - 1, nums[i - 1] - 1);
                } else {
                    i++;
                }
            } else i++;

        }

        List<Integer> list  = new ArrayList<>();
        for (int j = 0; j < n; j++) {
           if(nums[j] != j+1 ) list.add( j+1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(nums));
        System.out.println(findDisappearedNumbers(nums));
    }

}
