package recursion;

public class Q9_Power {


    public static int pow(int n, int p) {
        if (n == 0) return 1;
        if (p % 2 == 0) {
            return pow(n, p / 2) * pow(n, p / 2);
        } else {
            return pow(n, p / 2) * pow(n, p / 2) * n;
        }
    }

    public static void main(String[] args) {

        System.out.println(pow(4, 3));

    }

}
