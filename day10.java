import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> group(String[] a) {
        Map<String, List<String>> m = new HashMap<>();
        for (String s : a) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            m.computeIfAbsent(k, x -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(m.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(group(strs));
    }
}
