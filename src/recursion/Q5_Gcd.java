package recursion;

public class Q5_Gcd {

    public static int recurGcd(int n, int m) {
        if (n == 0) return m;
//        if(m <= 0) return n;

        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }
        return recurGcd(n % m, m);

    }

    public static int recurGcdEuclid(int n,int m){

        if(n==m){
            return n;
        }
        if(n>m){
            return recurGcdEuclid(n-m,m);
        }else{
            return recurGcdEuclid(n,m-n);
        }

    }



    public static void main(String[] args) {
        System.out.println(recurGcd(24, 9));
        System.out.println(recurGcdEuclid(24, 9));
    }
}
