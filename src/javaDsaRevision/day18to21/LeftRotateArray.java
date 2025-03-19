package javaDsaRevision.day18to21;

public class LeftRotateArray {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void rotateWithoutSpace(int[] nums, int k) {


    }

    private static void rotateWithSpace(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int track = 0;
        for(int i = k; i < nums.length; i++) temp[track++] = nums[i];
//        track = 0;
        for (int i = 0; i < k; i++) temp[track++] = nums[i];
        for (int i : temp) System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 7;
        k = k % nums.length;
        rotateWithSpace(nums,k);
        rotateWithoutSpace(nums,k);
    }


}
