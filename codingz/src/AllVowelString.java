import java.util.HashSet;
import java.util.Set;

public class AllVowelString {

    private static boolean hasAllVowels(String string) {
        char[] chars = string.toCharArray();
        boolean hasA = false;
        boolean hasE = false;
        boolean hasI = false;
        boolean hasO = false;
        boolean hasU = false;
        boolean hasCons = false;

        for (char aChar : chars) {
            if (aChar == 'a') {
                hasA = true;
            } else if (aChar == 'e') {
                hasE = true;
            } else if (aChar == 'i') {
                hasI = true;
            } else if (aChar == 'o') {
                hasO = true;
            } else if (aChar == 'u') {
                hasU = true;
            } else {
                hasCons = true;
            }
        }

        return hasA && hasE && hasI && hasO && hasU && !hasCons;
    }

    private static Set<String> stringSet = new HashSet<>();

    private static int getStrings(String string) {
        if (string.length() >= 5) {
            if (hasAllVowels(string)) {
                stringSet.add(string);
            }
            String s1 = string.substring(0, string.length() - 1);
            String s2 = string.substring(1, string.length());
            String s3 = string.substring(1, string.length() - 1);

            getStrings(s1);
            getStrings(s2);
            getStrings(s3);
        }

        return stringSet.size();
    }

    public static void main(String[] args) {
        String s = "aaeiouxeepouia";
        System.out.println(AllVowelString.getStrings(s));
        System.out.println(stringSet);
    }
}
