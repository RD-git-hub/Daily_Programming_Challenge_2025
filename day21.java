import java.util.*;

public class ReverseStackRec {
    public static void reverse(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int x = st.pop();
            reverse(st);
            insertAtBottom(st, x);
        }
    }

    private static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int y = st.pop();
        insertAtBottom(st, x);
        st.push(y);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        reverse(st);

        System.out.println(st);
    }
}
