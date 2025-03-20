package javaDsaRevision.day18to21;

public class SumofArray {

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5};
        int[] nums = {1,8};
        int sum = 0;
        for (int i : nums) sum+=i;
        System.out.println("Sum is : "+sum+" mean is : "+((float)sum/nums.length));
    }
}
