package javaDsaRevision.day18to21;

public class ThirdGreatInArray {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 37, 8};
//        int[] nums = {10, 10, 10};
        int g1 = Integer.MIN_VALUE,g2 = Integer.MIN_VALUE,g3=Integer.MIN_VALUE;
        for (int i : nums){
            if(i > g1){
                g3=g2;
                g2=g1;
                g1=i;
            }else if(i < g1 && i > g2){
                g3 = g2;
                g2= i;
            }else if(i< g1 && i < g2 && i > g3){
                g3 = i;
            }
        }
        System.out.println(g1 == Integer.MIN_VALUE ? "No 1st Great " : "1st great : "+g1 );
        System.out.println(g2 == Integer.MIN_VALUE ? "No 2nd Great " : "2nd great : "+g2 );
        System.out.println(g3 == Integer.MIN_VALUE ? "No 3rd Great " : "3rd great : "+g3 );
    }
}
