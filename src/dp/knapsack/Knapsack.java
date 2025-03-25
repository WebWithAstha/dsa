package dp.knapsack;

import java.util.Arrays;

public class Knapsack {



    public static void main(String[] args) {
        int[] values =  {50,10,30,70,40};
        int[] wei = {3,5,4,2,3};
        int target = 8;
        int n = values.length;
        Integer[][] dp = new Integer[n][target+1];

        int loot  =  knapsack(values,wei,target, n-1,dp);
        System.out.println(loot);

        for(Integer[] d : dp) System.out.println(Arrays.toString(d));

    }

    private static int knapsack(int[] values, int[] wei, int target,int n ,Integer[][] dp) {
        if(n == -1) return 0;
        if(dp[n][target] != null) return dp[n][target];
        if( wei[n] > target){
            return dp[n][target] = knapsack(values,wei,target,n-1,dp);
        }
        return dp[n][target] = Math.max( knapsack(values,wei,target,n-1,dp), values[n]+knapsack(values,wei,target- wei[n],n-1,dp));
    }
}
