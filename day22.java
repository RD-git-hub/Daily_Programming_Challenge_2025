import java.util.*;

public class FirstKRepeat {
    public static int firstKRepeat(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) == k) return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k = 2;
        System.out.println(firstKRepeat(arr, k));
    }
}
