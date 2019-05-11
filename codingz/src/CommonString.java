import java.util.Arrays;

public class CommonString {

    private static String trimString(String parent, String child) {
        char[] chars = parent.toCharArray();
        char[] chars1 = child.toCharArray();
        int count = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars[i] == chars1[i]) {
                count++;
            } else {
                break;
            }
        }
        return child.substring(0, count);
    }

    private static String getmatchedString(String[] array, String smallest, int end, int beg) {
        if (end >= beg) {
            int mid = (end + beg) / 2;
            smallest = trimString(array[mid], smallest);
            getmatchedString(array, smallest, mid - 1, 0);
            getmatchedString(array, smallest, end, mid + 1);
        }

        return smallest;

    }

    public static void main(String[] args) {
        String[] array = {"harshbhardwaj", "harsh", "hars", "harphe", "harshh"};

        Arrays.sort(array);
        String smallest = array[0];
        System.out.println(CommonString.getmatchedString(array, smallest, array.length - 1, 0));

    }

}
