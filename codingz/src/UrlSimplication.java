public class UrlSimplication {

    static String SimplyURL(String string, Integer actualLength) {

        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (actualLength > 0 && (int) aChar == 32) {

            }
        }
        return "";
    }

    public static void main(String[] args) {
        UrlSimplication.SimplyURL("Mr John Smith ", 13);
    }
}
