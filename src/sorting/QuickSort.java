package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1; // point jo -1 index point kr ra h
        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(i, j, arr);
            }
        }
        i++;
        swap(i, e, arr);
        return i;
    }

    public static void sort(int[] arr, int s, int e) {
        if (s >= e) return;
        int pivotIndex = partition(arr, s, e);
        sort(arr, s, pivotIndex - 1);
        sort(arr, pivotIndex + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 11, 7, 10};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
