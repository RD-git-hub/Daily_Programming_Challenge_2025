import java.util.*;

public class PrimeFactorization {
    public static List<Integer> factorize(int n) {
        List<Integer> f = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                f.add(i);
                n /= i;
            }
        }
        if (n > 1) f.add(n);
        return f;
    }

    public static void main(String[] args) {
        int n = 18;
        System.out.println(factorize(n));
    }
}
