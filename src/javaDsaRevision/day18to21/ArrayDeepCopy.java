package javaDsaRevision.day18to21;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {1, 2, 3, 4, 5};
        int[] temp = new int[n];
        for (int i = 0; i <n;i++){
            temp[i] = nums[i];
            System.out.print(temp[i]+" ");
        }
        System.out.println(Arrays.equals(nums,temp));

    }
}
