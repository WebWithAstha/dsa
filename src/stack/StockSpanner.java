package stack;

import java.util.ArrayList;
import java.util.Stack;

class StockSpanner {

    Stack<Integer> st = new Stack<>();
    ArrayList<Integer> list = new ArrayList<>();
    public int next(int price) {
        int currentI = list.size();
        int spanI = -1;
        list.add(price);
        st.push(list.size() - 1);
        while (!st.isEmpty() && st.peek() <= price){
            st.pop();
        }
        if(!st.isEmpty()){
            spanI = st.peek();
        }
        return currentI - spanI;
    }
}
