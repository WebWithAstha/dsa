package recursion;

public class Q7_Factor {

    public static int factor(int n) {
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                System.out.println(i);
                if(i*i != n) System.out.println(n/i);;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(factor(100));
    }
}
