package prac;

public class Gcd {


    public static void main(String[] args) {
        System.out.println(getGcd(66,99));
        System.out.println(recrGcd(99,66));
    }

    private static int recrGcd(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
//        System.out.println(a+" "+b);
        return recrGcd(b%a, a);
    }


    private static int getGcd(int a, int b) {
        while( a != 0 && b !=0 ) {
            if(a>b) a %= b;
            else b %= a;
        }

        if(b == 0) return a;
        else return b;

    }
}
