package javaDsaRevision.day11;

import java.util.Scanner;

public class Factorial {

    public static int fiboRec(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fiboRec(n-1)+fiboRec(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n =sc.nextInt();
        for (int i = 1; i <= n/i; i++){
            if(n%i==0) System.out.print(i+" ");
        }
        System.out.println(n);
        System.out.println(fiboRec(3));
    }
}
