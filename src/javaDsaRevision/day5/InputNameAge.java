package javaDsaRevision.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputNameAge {

    private static void inputByScanner() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter name and age : ");
        String name = sc.next();
        int age =  sc.nextInt();
        System.out.println("Hello "+name+", you are "+age+" years old.");
    }

    private static void inputByBuffer () throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br =  new BufferedReader(in);
        System.out.println("Enter name and age : ");
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());
        System.out.println("Hello "+name+", you are "+age+" years old.");
    }

    public static void main(String[] args) throws IOException {
        inputByScanner();
        inputByBuffer();
    }
}
