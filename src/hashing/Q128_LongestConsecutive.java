package hashing;

import java.util.HashMap;


public class Q128_LongestConsecutive {


    public static int longestConsecutive(int[] nums) {
        int longest  = 0;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int num : nums) map.put(num,true);

        for(int num : nums){
            if(map.containsKey(num-1)) map.put(num,false);
        }
        for(int key : map.keySet()){
            if(map.get(key)){
                int count = 1;
                while(map.containsKey(key+count)) count++;
            longest = Math.max(longest,count);
            }
        }

        return longest;
    }


    public static void main(String[] args) {
//        int[] nums = {100,4,200,1,3,2};
        int[] nums = {-1,1,2,0};
//        int[] nums = {0,3,7,2,5,8,4,6,0,1};
//        int[] nums = {1,0,-1};





        System.out.println(longestConsecutive(nums));

    }
}
