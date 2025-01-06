package optimized;

import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 40;

        boolean checker[] = new boolean[n + 1];
        Arrays.fill(checker, true);
        checker[0] = false;
        checker[1] = false;

        for (int i = 2; i < n / i; i++) {
            if (checker[i]) {
                for (int j = i * i; j <= n; j += i) {
                    checker[j] = false;
                }
            }
        }

        int count = 0;
        for (int j = 2; j <= n; j++) {
            if (checker[j]) count++;
        }

        for (int j = 2; j <= n; j++) {
            if (checker[j]) System.out.print(j + " ");
        System.out.println(" ");
        }
        for (int j = 2; j <= n; j++) {
            if (!checker[j]) System.out.print(j + " ");
        }

    }
}
