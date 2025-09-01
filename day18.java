public class DivisorCount {
    public static int count(int n) {
        int c = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                c++;
                if (i != n / i) c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(count(n));
    }
}
