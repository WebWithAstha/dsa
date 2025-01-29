package hashing;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.*;

public class Q128_LongestConsecutive {


    public static int longestConsecutive(int[] nums) {


        int longest = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) set.add(num);


        // -1,1,2,0
        int maxUntil = Integer.MIN_VALUE;
        for (int num : nums) {
            int current = 1;
            int a = num-1;
            out.println();
            out.println(num);
            while (set.contains(a)) {
                current++;
                out.println(a);
                if (current < longest && a <= maxUntil){
                    if(a == maxUntil ){
                        current= maxUntil+current;
                    }
                    out.println("current h : "+current);
                    break;
                }
                a--;
            }
            if (current >= longest){
                maxUntil = num;
            }
            longest = Math.max(longest, current);
            out.println("maxUntil = " + maxUntil+" longest = "+longest);
        }


        return longest;
    }


    public static void main(String[] args) {
//        int[] nums = {100,4,200,1,3,2};
        int[] nums = {-1,1,2,0};
//        int[] nums = {0,3,7,2,5,8,4,6,0,1};
//        int[] nums = {1,0,-1};





        out.println(longestConsecutive(nums));

    }
}
