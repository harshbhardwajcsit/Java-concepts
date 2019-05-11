public class Uniquesness {
    public static void main(String[] args) {
//        int[] a1 = {1, 5, 7, 9, 10, 6, 2};
//        int[] a2 = {10, 10, 7, 2, 1, 10, 7};

        int[] a1 = {7, 5, 1, 9, 10};
        int[] a2 = {10, 0, 10, 9, 1};

        int uniqueValue = a2[0];
        int sum = 0;
        int maxValue = a1[0];
        for (int i = 0; i < a2.length; i++) {
            if (uniqueValue == a2[i]) {
                    maxValue = Math.max(maxValue, a1[i]);
                if (i == a2.length - 1) {
                    sum = sum + maxValue;
                }
            } else {
                if (i == a2.length - 1) {
                    sum = sum + a1[i];
                }
                sum = sum + maxValue;
                maxValue = a1[i];
            }
            uniqueValue = a2[i];
        }
        System.out.println(sum);
    }
}
