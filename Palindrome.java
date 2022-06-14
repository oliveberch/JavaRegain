import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int size = A.length();
        String R = "";
        for (int i = size - 1; i >= 0; i -= 1) {
            R = R + A.charAt(i);
        }
        if ((R.compareTo(A)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}