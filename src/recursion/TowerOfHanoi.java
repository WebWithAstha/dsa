package recursion;

public class TowerOfHanoi {

    public static void getSteps(int n, int s, int h, int d) {
        if (n == 1) {
            System.out.println(s + " -> " + d);
            return;
        }

        getSteps(n - 1, s, d, h);
        System.out.println(s + " -> " + d);
        getSteps(n-1, h, s, d);

//        return;

    }


    public static void main(String[] args) {

        int n = 2;
        //  plates, source, helper, destination
        getSteps(n, 1, 2, 3);
    }
}
