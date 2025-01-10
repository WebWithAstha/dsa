package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void divide(int[] arr, int s, int e) {
        // log(n) + hr partion pe ek loop (n) => nlogn
        if (s >= e) return;
        int mid = s + ((e - s) / 2);

        // diving 1st half of array
        divide(arr, s, mid);

        // diving 2nd half of array
        divide(arr, mid + 1, e);

        conquer(arr, s, mid, e);

    }

    public static void conquer(int[] arr, int s, int m, int e) {
        int[] temp = new int[e - s + 1];
        int idx1 = s, idx2 = m + 1, i = 0;

//      fill temp with smallest among both halfs
        while (idx1 <= m && idx2 <= e) {
            if (arr[idx1] < arr[idx2]) {
                temp[i++] = arr[idx1++];
            } else {
                temp[i++] = arr[idx2++];
            }
        }

//      if 2nd half exhausts, filling rest 1st half elements into temp
        while (idx1 <= m) temp[i++] = arr[idx1++];

//      if 1st half exhausts, filling rest 2nd half elements into temp
        while (idx2 <= e) temp[i++] = arr[idx2++];

//      putting temp into original array
        for (int j = 0, k = s; j < temp.length; j++,k++) {
            arr[k] = temp[j];
        }

    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 11, 7, 2};
        System.out.println(Arrays.toString(arr));
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
