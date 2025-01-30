package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q349_IntersectionOf2Array {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int num : nums1){
            map1.put(num, map1.getOrDefault(num,0)+1);
        }

        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int num : nums2){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (Integer key : map1.keySet()){
            if(map2.containsKey(key))
                set.add(key);
        }

        return  set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
}
