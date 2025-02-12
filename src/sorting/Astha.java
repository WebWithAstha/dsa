package sorting;

import java.util.Arrays;

public class Astha {

    public static void divide(int[] nums, int start, int end) {

        if (start >= end) return;

        int mid = (start + end) / 2;
        divide(nums, start, mid);
        divide(nums, mid + 1, end);


        // arr , s ,m ,eend
        sortAndAdd(nums,start,mid,end);
    }


    public static void sortAndAdd(int[] nums, int start, int mid, int end) {
        // s - m    // idx1
        // m+1 - e  // idx2

        int[] temp = new int[end - start + 1];
        int i = 0; // point current in temp

        int idx1 = start; // point current in 1st portion
        int idx2 = mid + 1; // point current in 2nd portion

        // putting smaller elem among both portion into temp
        while (idx1 <= mid && idx2 <= end) {
            if (nums[idx1] < nums[idx2]) temp[i++] = nums[idx1++];
            else temp[i++] = nums[idx2++];
        }

        // if 1st portion still has elems
        while (idx1 <= mid) temp[i++] = nums[idx1++];

        // if 2nd portion still has elems
        while (idx2 <= end) temp[i++] = nums[idx2++];

        System.out.println(nums.length+" "+temp.length);

        // mapping temp to nums
        for (int j = 0, k = start; j < temp.length; j++, k++) nums[k] = temp[j];



    }


    public static void main(String[] args) {

        int[] nums = {9, 5, 3, 11, 7, 2};
        System.out.println(Arrays.toString(nums));
        divide(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
}
