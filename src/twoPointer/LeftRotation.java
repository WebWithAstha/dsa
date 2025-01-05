package twoPointer;

import java.util.Arrays;

public class LeftRotation {

    public static void reverse(int[] arr,int i,int j){
        while (i<j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    public static int[] leftRotationByBlockSpace(int[] arr, int k) {

        int n = arr.length;

        k %= n;
        int[] brr = new int[n];

        int j = 0;
        for (int i = k; i < n; i++) {
            brr[j++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            brr[j++] = arr[i];
        }


        return brr;
    }

    public static int[] leftRotationByReverse(int[] arr, int k) {

        int n = arr.length;
        k %= n;

        // reversing 1st block
        reverse(arr,0,k-1);
        // reversing 2nd block
        reverse(arr,k,n-1);
        // reversing whole
        reverse(arr,0,n-1);

        return arr;

    }
    public static int[] rightRotationByReverse(int[] arr, int k) {

//       1,2,3,4,5,6,7 //  4,5,6,7,1,2,3 //  5,6,7,1,2,3,4

//       7,6,5,4,3,2,1
//       5,6,7,1,2,3,4

//       5,6,7,1,2,3,4
//

        int n = arr.length;
        k %= n;

        // reversing whole
        reverse(arr,0,n-1);
        // reversing 1st block
        reverse(arr,0,k-1);
        // reversing 2nd block
        reverse(arr,k,n-1);

        return arr;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6,7};
//        int[] brr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(leftRotationByReverse(arr, 3)));
        System.out.println(Arrays.toString(rightRotationByReverse(arr, 3)));
//        System.out.println(Arrays.toString(leftRotationByBlockSpace(brr, 3)));

    }
}
