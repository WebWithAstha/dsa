package javaDsaRevision.day18to21;

public class IsArraySorted {
    public static boolean isSorter( int[] nums){
        for(int i = 1; i< nums.length; i++ ){
            if(nums[i-1] > nums[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {2, 3, 3, 9, 8, 8};
        System.out.println(isSorter(nums));
    }
}
