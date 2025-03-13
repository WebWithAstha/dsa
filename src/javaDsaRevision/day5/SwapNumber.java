package javaDsaRevision.day5;

public class SwapNumber {

    private static void swapInPlace(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a : "+a+" b is : "+b);
    }

    private static void swapWithSpace(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a : "+a+" b is : "+b);
    }

    public static void main(String[] args) {
        int a = 5,b=10;
        swapWithSpace(a,b);
        swapInPlace(a,b);
    }
}
