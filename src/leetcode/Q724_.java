package leetcode;

public class Q724_ {

    public static int findPivot(int[] nums) {
        int[] left = new int[nums.length] ;
        int sum = 0;
        for (int j = 1; j < nums.length; j++) {
            sum+= nums[j];
            left[j] = sum;
        }
        sum = 0;
        for (int j = nums.length-1; j >= 0; j--) {
            sum+= nums[j];
            if(left[j] == sum) return j;
        }
        return 0;

    }

    public static void main(String[] args) {

        int[] nums = {1,1,2};

        System.out.println(findPivot(nums));



    }


}
