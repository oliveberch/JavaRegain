public class Mountain {
    public static void main(int a) {
        int k, l, m, n, p;
        for (m = a, k = 0; m > 0; k += 1, m -= 1) {
            for (n = 0; n < m; n += 1) {
                System.out.print(" ");
            }

            for (l = 0; l <= k; l += 1) {
                System.out.print("_");
            }

            for (p = 0; p < k; p += 1) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
