package leetcode;

public class Q1089_DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int count = 0;


//        1 0 2 3 0 4 5 0
//                      i     j
//        1 0 2 3 0 4 5 0 _ _ _
//        _ _ _ _ _ _ _ _ _ _ _

        for (int e : arr) if (e == 0) count++;

        int i = arr.length - 1;
        int j = arr.length + count - 1;

        while (count != 0) {

            if (j < arr.length) {

                if (arr[i] == 0) {
                    i--;
                }
                arr[j] = arr[i];
            }


        }


    }
}
