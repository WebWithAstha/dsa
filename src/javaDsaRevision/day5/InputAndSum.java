package javaDsaRevision.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputAndSum {

    public static void printByScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }

    public static void printByBuffer() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter 2 numbers : ");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a+b);

    }

    public static void main(String[] args) throws IOException {
        printByScanner();
        printByBuffer();
    }
}
