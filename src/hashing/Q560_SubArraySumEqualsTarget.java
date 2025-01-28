package hashing;

import java.util.HashMap;
import java.util.Map;

public class Q560_SubArraySumEqualsTarget {

    public static int subarraySum(int[] nums, int k) {

        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum+=num;
            int dif = sum - k;
            if (map.containsKey(dif)) ans += map.get(dif);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }

//    public int[] twoSum(int[] arr, int target) {
//        //Write your code here
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0;i<arr.length;i++ ) map.put(arr[i],i);
//
//        for(int key : map.keySet()){
//            if(map.containsKey(target-key)){
//                // int[] ans = new arr[2];
//                // ans[0] = map.get(key);
//                // ans[1] = map.get(target-key);
//                return new int[]{map.get(key),map.get(target-key)};
//
//            }
//        }
//    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(nums,k));
    }
}
