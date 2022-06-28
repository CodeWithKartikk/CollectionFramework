package collectionFramework;

import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Insert items in Stack
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);

        // Remove Items from Stack
        st.pop();
        System.out.println(st);

        // Top of the Stack
        int a = st.peek();
        System.out.println(a);
    }
}
