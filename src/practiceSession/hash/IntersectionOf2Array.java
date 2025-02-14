package practiceSession.hash;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOf2Array {

    public static int[] intesection(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new  HashSet<>();
        for(int n : nums1) set1.add(n);
        HashSet<Integer> set2 = new  HashSet<>();
        for(int n : nums2) set2.add(n);

//        ArrayList<Integer> list = new ArrayList<>();
//        for(int n : set1) if(set2.contains(n)) list.add(n);

        set1.retainAll(set2);
        System.out.println(set1);

        int[] arr = new  int[set1.size()];
        int i = 0;
        for(int n : set1){
            arr[i++]= n;
        }


        return arr;


    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,2,1};
        int[] nums1 = {4,9,5};
//        int[] nums2 = {2,2};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intesection(nums1,nums2)));




//        System.out.println(list);

    }
}
