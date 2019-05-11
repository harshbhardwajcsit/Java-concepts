import java.util.HashMap;
import java.util.Map;

public class NumberForPalindromes {
    static Map<String, Integer> map = new HashMap<>();

    private static Map<String, Integer> numberP(String s) {
        if (s.length() > 1) {
            if (isPalindrome(s)) {
                map.put(s, 0);
            }
            String s1 = s.substring(0, s.length() - 1);
            String s2 = s.substring(1, s.length());
            String s3 = s.substring(1, s.length() - 1);
            numberP(s1);
            numberP(s2);
            numberP(s3);
        }

        return map;

    }


    private static Boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder(s);
        String s2 = s1.reverse().toString();
        return s2.equals(s);
    }

    public static void main(String[] args) {

        final String string = "abecdcefec";
        System.out.println(NumberForPalindromes.numberP(string));

    }
}
