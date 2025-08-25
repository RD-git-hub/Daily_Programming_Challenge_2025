import java.util.*;

public class Permutations {
    public static List<String> permute(String s) {
        List<String> r = new ArrayList<>();
        backtrack("", s, r, new HashSet<>());
        return r;
    }

    private static void backtrack(String p, String s, List<String> r, Set<String> v) {
        if (s.isEmpty()) {
            if (!v.contains(p)) {
                r.add(p);
                v.add(p);
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            backtrack(p + s.charAt(i), s.substring(0, i) + s.substring(i + 1), r, v);
        }
    }

    public static void main(String[] args) {
        System.out.println(permute("abc"));
    }
}
