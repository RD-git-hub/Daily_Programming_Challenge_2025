import java.util.*;

public class LongestSubstringUnique {
    public static int longestUnique(String s) {
        int n = s.length(), l = 0, ans = 0;
        Map<Character, Integer> m = new HashMap<>();

        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);
            if (m.containsKey(c) && m.get(c) >= l) {
                l = m.get(c) + 1;
            }
            m.put(c, r);
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestUnique(s));
    }
}
