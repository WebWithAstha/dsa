package javaDsaRevision.day6;

import java.util.Scanner;

// p ( 1 + r/n )^nt
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();

        System.out.println("Compound interest is : "+(p*Math.pow(1+r , t)));

    }
}
