import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        boolean result = true;
        a = a.toUpperCase();
        b = b.toUpperCase();
        char[] alphaA = a.toCharArray();
        char[] alphaB = b.toCharArray();
        char temp = 0;
        if (alphaA.length != alphaB.length) {
            return false;
        }
        for (int i = 0; i < alphaA.length; i++) {
            for (int j = 0; j < alphaA.length; j++) {
                if (alphaA[j] > alphaA[i]) {
                    temp = alphaA[i];
                    alphaA[i] = alphaA[j];
                    alphaA[j] = temp;
                }
            }
        }
        for (int i = 0; i < alphaB.length; i++) {
            for (int j = 0; j < alphaB.length; j++) {
                if (alphaB[j] > alphaB[i]) {
                    temp = alphaB[i];
                    alphaB[i] = alphaB[j];
                    alphaB[j] = temp;
                }
            }
        }
        for (int i = 0; i < alphaA.length; i += 1) {
            if (alphaA[i] != alphaB[i]) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings to check if  they are anagram");
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
