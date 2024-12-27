package recursion;

public class Q1_HelloWorld {

    public static void printHelloWorld(int n){
        if(n<=0){
            return;
        }
        printHelloWorld(--n);
        System.out.println("Hello world");
    }

    public static void main(String[] args) {

        printHelloWorld(5);

    }

}
