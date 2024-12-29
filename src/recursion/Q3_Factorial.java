package recursion;

public class Q3_Factorial {

    public static int recurFact(int n){
        if(n<=1) return n;
        return n* recurFact(--n);
    }

    public static void main(String[] args) {
        System.out.println(recurFact(5));
    }


}
