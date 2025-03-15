package javaDsaRevision.day8;

import java.util.Scanner;

public class ValidVoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age : ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        if(18-age > 0) System.out.println("Hello "+name+", you will be eligible to vote in "+(18-age)+" years.");
        else System.out.println("Hello "+name+", you are a voter.");
    }
}
