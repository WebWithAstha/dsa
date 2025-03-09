package prac;

import java.util.Arrays;

public class countPrime {

    public static void main(String[] args) {
        System.out.println(getPrimeCount(20));
    }

    private static int getPrimeCount(int n) {
        if( n < 2) return 0;
        boolean[] bool  = new boolean[n+1];
        Arrays.fill(bool,true);
        int count = 0;

        for (int i = 2; i < n+1;i++){
            if(bool[i]){
                count++;
            for(int j=i+i; j< n+1; j+=i){
                if(bool[j]) bool[j] = false;
            }
            }

        }
        return count;

    }
}
