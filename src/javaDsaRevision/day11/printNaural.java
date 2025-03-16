package javaDsaRevision.day11;

import java.util.Scanner;


public class printNaural {

    public static void natural(int n) {
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
    }


   public static void naturalReverse(int n) {
       for (int i = n; i > 0; i--) System.out.print(i + " ");
   }

   public static void naturalRec(int n){
        if( n==1) {
            System.out.print(1 + " ");
            return;
        }
       naturalRec(n-1);
       System.out.print(n+" ");
   }
public static void naturalRevRec(int n){
        if( n==1) {
            System.out.print(1 + " ");
            return;
        }
       System.out.print(n+" ");
        naturalRevRec(--n);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        natural(n);
        System.out.println();
        naturalReverse(n);
        System.out.println();
        naturalRec(n);
        System.out.println();
        naturalRevRec(n);
        }
}
