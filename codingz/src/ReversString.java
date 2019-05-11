public class ReversString {
    public static void main(String[] args) {
        String string = "Harsh";
        char arr[] = string.toCharArray();
        char arr2[] = new char[arr.length];
        int k = arr.length - 1;
        for (char c : arr) {
            arr2[k] = c;
            k--;
        }
        String reversString = new String(arr2);
        System.out.println(reversString);
    }
}
