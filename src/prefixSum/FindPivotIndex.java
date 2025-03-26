package prefixSum;

public class FindPivotIndex {


    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(getPivot(nums));
    }

    private static int getPivot(int[] nums) {

        // make rightPrefix sum array
        // make leftPrefix sum array
        // common index with same sum is pivot
        int n =  nums.length;
        int[] right = new int[n];
        int preSum = 0;
        for (int i = n-1 ; i >=0; i--) {
            preSum += nums[i];
            right[i] = preSum;
        }
        preSum =0;
        for (int i  = 0; i < n; i++){
            preSum += nums[i];
            if(right[i] == preSum) return i;
            nums[i] = preSum;
        }
        return -1;
    }

}
