package recursion;

public class Q2_Sum {

    public static int recurSum(int n) {
        if (n <= 0) {
            return n;
        }
        return n + recurSum(--n);
    }

    public static void main(String[] args) {
        System.out.println(recurSum(5));
    }

}
