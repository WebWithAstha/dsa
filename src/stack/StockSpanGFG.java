package stack;


import java.util.ArrayList;
import java.util.Stack;

public class StockSpanGFG {
    // Function to calculate the span of stock's price for all n days.
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list =  new ArrayList<>();
        System.out.println(st);
        for(int i = 0; i< arr.length;i++){
            // int currentI = list.size();
            System.out.println(i);
            int spanEndI = -1;

            // traversing stack to reach span end
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            // updating span end if stack gets empty
            if(st.isEmpty()) spanEndI =-1;
            else spanEndI = st.peek();

            // adding span count to list
            list.add(i-spanEndI-1);
            // pushing to the stack
            st.push(i);


        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        System.out.println(calculateSpan(arr));
    }
}
