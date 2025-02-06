package powerSession;

public class PeekIndexInMountain {

//    public static int peakIndexInMountainArray(int[] arr) {
//
//        int left  = 0;
//        int right = arr.length-1;
//        while (left<right){
//            int mid = left + (right-left)/2;
//            if(arr[mid] <= arr[mid+1]){
//                left = mid+1;
//            }else {
//                right = mid;
//            }
//        }
//        return arr[left];
//
//    }

    public static int peakFind(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid ;
            }
        }

        return arr[start];
    }

//taworhanoi (n-1,s , d , h)
//    sout(s+"->"d)
//taworhanoi (n-1,h,s,d)


    public static void main(String[] args) {
        int[] arr = {0, 2, 10,5 , 4};
        System.out.println(peakFind(arr));
    }
}
