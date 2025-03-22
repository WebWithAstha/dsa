package javaDsaRevision.day18to21;

public class SecondGreatInArray {
    public static void main(String[] args) {
//        int[] nums = {10, 5, 2, 37, 8};
        int[] nums = {10, 10,10};
        int g1 = Integer.MIN_VALUE, g2 = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > g1) {
                g2 = g1;
                g1 = i;
            }else if( i < g1 && i > g2) g2 = i;
        }
        System.out.println((g2 == Integer.MIN_VALUE) ? "No 2nd great":"2nd great is : "+g2);
    }
}
