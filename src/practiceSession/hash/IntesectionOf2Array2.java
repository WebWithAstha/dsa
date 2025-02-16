package practiceSession.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntesectionOf2Array2 {


    public static int[] intesection(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map1 = new  HashMap<>();
        for(int n : nums1) map1.put(n,map1.getOrDefault(n,0)+1);
        HashMap<Integer,Integer> map2 = new  HashMap<>();
        for(int n : nums2) map2.put(n,map2.getOrDefault(n,0)+1);

        ArrayList<Integer> list = new ArrayList<>();

        for (int key : map1.keySet()){
            if(map2.containsKey(key)){
                int c = Math.min(map2.get(key) , map1.get(key));
                for(int i = 0; i<c;i++) list.add(key);
            }
        }

        int[] arr = new  int[list.size()];
        for (int i = 0;i<list.size();i++) arr[i] = list.get(i);

        return arr;


    }




    public static void main(String[] args) {
                int[] nums1 = {1,2,2,1};
//        int[] nums1 = {4,9,5};
        int[] nums2 = {2,2};
//        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intesection(nums1,nums2)));

    }
}
