import java.util.*;

public class CountSubstringsWithKDistinct {
    public static int countSubstrings(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    private static int atMostK(String s, int k) {
        int n = s.length();
        int l = 0, ans = 0;
        Map<Character, Integer> m = new HashMap<>();

        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);
            m.put(c, m.getOrDefault(c, 0) + 1);

            while (m.size() > k) {
                char d = s.charAt(l);
                m.put(d, m.get(d) - 1);
                if (m.get(d) == 0) m.remove(d);
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println(countSubstrings(s, k));
    }
}
