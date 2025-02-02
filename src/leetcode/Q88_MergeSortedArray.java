package leetcode;

import java.util.Arrays;

public class Q88_MergeSortedArray {

    public static void mergeSorted(int[] nums1, int m, int[] nums2, int n) {

//              i
//        i  i
//        1, 2, 3, 0, 0, 0
//        _  _  _  _  _  _
//        1  2  2  3  5  6
//        _  _  _  _  _  _
//        2, 5, 6
//        j
//              j

        int i = m - 1, j = n - 1, k = m + n - 1;

        while (k >= 0) {

            System.out.println(i + " " + j);
            if (j == -1) break;
            if (i == -1) {
                nums1[k] = nums2[j];
                j--;
                k--;
            } else if (nums2[j] >= nums1[i]) {
                nums1[k] = nums2[j];
                j--;
                k--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }

        System.out.println(Arrays.toString(nums1));


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int k = n+m-1;
        while (i>-1 && j>-1){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while (i>-1) nums1[k--] = nums1[i--];
        while (j>-1) nums1[k--] = nums2[j--];

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
//        int[] nums1 = {0};
//        int[] nums2 = {1};
//        int m = 0, n = 1;
        System.out.println(Arrays.toString(nums1));
//        mergeSorted(nums1, m, nums2, n);
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
