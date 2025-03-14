package javaDsaRevision.day6;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter sides of triangle : ");
        int a = sc.nextInt() , b =sc.nextInt() , c= sc.nextInt();
        double s = (double) (a + b + c) /2;
        double ans = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle : "+ans);
    }
}
