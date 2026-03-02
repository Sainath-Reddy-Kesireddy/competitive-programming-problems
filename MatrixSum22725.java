import java.util.*;
public class MatrixSum22725 {
    static final long MOD = 1000000007;
    static long power(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long p = sc.nextLong();
            long ans = (power(n, p + 1) * power(x, p)) % MOD;
            System.out.println(ans);
        }
        sc.close();
    }
}
