package binary;

public class SearchRotatedSorted {

    public static int search(int[] nums, int target) {

        int start = 0, end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if( nums[mid] == target) return mid;

            // left part is sorted
            if (nums[start] <= nums[mid]) {

                // in range
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } // not in range
                else{
                    start = mid + 1;
                }

            } // right is sorted
            else{

                // in range
                if(target >= nums[mid] && target <= nums[end]){
                    start = mid +1;
                } // not in range
                else{
                    end = mid - 1;
                }

            }


        }


        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 3));
    }
}
