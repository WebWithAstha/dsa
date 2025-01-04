package optimized;


public class Sqrt {

    public static int sqrt(int n) {


        int start = 1, end = n / 2, mid = start + (end - start) / 2;
        int sqrt = mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid <= n / mid) {
                start = mid + 1;
                sqrt = mid;
            } else {
                end = mid - 1;
            }

        }

        return sqrt;


    }

    public static void main(String[] args) {
        System.out.println(sqrt(99));
    }
}
