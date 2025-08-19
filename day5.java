import java.util.*;

public class LeadersInArray {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leaders: " + leaders);
    }
}
