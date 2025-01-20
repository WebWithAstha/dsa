package leetcode;

import java.util.Arrays;

public class Q75_SortColor {

    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortColor(int[] nums) {
        int n = nums.length;
        int s = 0; // pointer for 0s
        int m = 0;
        int e = n - 1; // pointer for 2s

        while (m <= e ) {
            // m is 0 then swap with start
            if(nums[m] == 0){
                swap(m,s,nums);
                s++;
                m++;
            }
            // m is 2 then swap with end
            else if(nums[m] == 2){
                swap(m,e,nums);
                e--;
            }
            // m is 1 so no need to swap
            else{
                m++;
            }

        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {2,0,1};
//        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(nums));
        sortColor(nums);
    }
}


