package prac;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(getSqrt(50));
    }

    private static int getSqrt(int n) {
        int ans = 0;
        int start  = 1;
        int end = n/2;

        while(start <end){
            int mid = start +(end -start)/2;
            if(mid <= n/mid){
                ans = mid;
                end = mid;
            }else{
                start = mid;
            }
        }
        return ans;
    }
}
