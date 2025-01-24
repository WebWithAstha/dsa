package binary;

public class PeakIndex {

    public static int findPeak(int[] arr) {

        //          m                        m   j
        //        i/j                        m   j
        //     i   j
        // i   m   j
        // i       m        j
        // i                m                   j
        // 24, 69, 100, 99, 79, 78, 67, 36, 26, 19
        // 0   1   2    3   4   5   6   7   8   9
        //         p




        //         m   e
        //         s   e
        // s   e
        // s   m       e
        // 3   4   5   1
        // 0   1   2   3




        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            mid = start + (end - start) / 2;

            System.out.println("start " + start + " end " + end + " mid " + mid);
            if (arr[mid] > arr[mid+1]) {
                end =mid;
            } else{
                start = mid +1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
//        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        int[] arr = {3,4,5,1};
        System.out.println(findPeak(arr));
    }
}
