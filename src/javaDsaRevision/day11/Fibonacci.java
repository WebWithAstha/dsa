package javaDsaRevision.day11;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n =sc.nextInt();
        printFibo(n);
        printFiboRec(n);
    }

    private static void printFiboRec(int n) {
        System.out.print(0+" ");
        if(n == 1)return;
        System.out.print(1+" ");
        if(n==2) return;
        int f = 0, s=1;
        for (int i = 2; i< n;i++){
            System.out.print(f+s+" ");
            int t=f+s;
            f=s;
            s= t;
        }
    }

    private static void printFibo(int n) {
    }
}
