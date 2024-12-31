package recursion;

public class Q4_Fibonacci {

    public static int recurFibonacci(int n){
        if(n <=1){
            return n;
        }
        return recurFibonacci(n-1) +recurFibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(recurFibonacci(16));
    }
}
