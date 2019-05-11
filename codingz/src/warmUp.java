public class warmUp {

    static int findMax(int array[]) {
        int maximumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maximumIndex]) {
                maximumIndex = i;
            }
        }
        return maximumIndex;
    }

    public static void main(String[] args) {

    }

}
