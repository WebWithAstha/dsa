package leetcode;

public class Q121_MinMaxProfit {
    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};
        int min = nums[0];
        int maxP =0 ;
        for (int price : nums){
            maxP = Math.max(maxP,price-min);
            min = Math.min(min , price);
        }
        System.out.println(min+ " " +maxP);
    }
}
