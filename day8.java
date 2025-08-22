public class ReverseWords {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] w = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            sb.append(w[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println("Output: \"" + reverseWords(s) + "\"");
    }
}
