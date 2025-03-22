package javaDsaRevision.day18to21;

public class GreatestInArray {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 37, 8};
        int great = Integer.MIN_VALUE;
        for(int i : nums) great = Math.max(great,i);
        System.out.println("Greatest is : "+great);
    }
}
