package recursion;

public class Q5_Lcm {

    public static int lcm(int n, int m) {

        int min = Math.min(n, m);
        int max = Math.max(n, m);

        if ((max % min) == 0) return max;

        while (max % n != 0 || max % m != 0) {
            max++;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lcm(2, 3));
    }
}
