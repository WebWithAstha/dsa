package leetcode;

public class Q169_MajorityElement {
    public static int mooreAlgo(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for (int i = 0; i<nums.length ; i++){
                if(majority == nums[i]){
                    count++;
                }else{
                    count--;
                    if (count == 0) {
                        majority = nums[i];
                        count++;
                    }
                }
        }

        return majority;
    }

    public static void main(String[] args) {
        int[] height = {2, 2, 1, 1, 1, 2, 2};
//        int[] height = {3,2,3};
        System.out.println(mooreAlgo(height));
    }
}
