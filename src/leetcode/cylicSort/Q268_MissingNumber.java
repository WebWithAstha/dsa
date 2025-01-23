package leetcode.cylicSort;

public class Q268_MissingNumber {

    public static void swap(int[] nums, int i, int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int missingNumber(int[] nums) {

        // cylic sort
        //                 8
        //                 i

//            7 // 0,1,2,3,4,5,6,7,9
//            6 // 0,9,2,3,4,5,6,7,1
//            5 // 0,9,3,2,4,5,6,7,1
//            4 // 0,9,4,2,3,5,6,7,1
//            3 // 9,0,4,2,3,5,6,7,1
//            2 // 9,7,4,2,3,5,6,0,1
//            1 // 9,6,4,2,3,5,7,0,1

        int i = 0;
        int n = nums.length;
        while (i < n) {
            if( nums[i] != n && nums[i] != i) swap(nums,i,nums[i]);
            else i++;

        }
        for (int j = 0; j < n; j++) {
           if(nums[j] != j ) return j;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

}
