import java.util.*;

public class PostfixEval {
    public static int eval(String exp) {
        Stack<Integer> st = new Stack<>();
        for (String t : exp.split(" ")) {
            if ("+-*/".contains(t)) {
                int b = st.pop();
                int a = st.pop();
                switch (t) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break;
                }
            } else {
                st.push(Integer.parseInt(t));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String s = "2 1 + 3 *";
        System.out.println(eval(s));
    }
}
