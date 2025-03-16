package javaDsaRevision.day11;

import java.util.Scanner;

public class sumN {

    public static int sum(int n){
        int sum= 0;
        for (int i = 1;i<=n;i++)sum+=i;
        return sum;
    }
    public static int sumRec (int n,int sum){
        if(n==1)
            return sum+=1;
        sum+=n;
        return sumRec(n-1,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n =sc.nextInt();
        System.out.println(sum(n));
        System.out.println(sumRec(n,0));
    }
}
