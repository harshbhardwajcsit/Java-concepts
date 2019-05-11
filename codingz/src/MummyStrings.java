import java.util.Scanner;

public class MummyStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a[] = new int[t];
        for (int i = 0; i < t; i++) {
            int w = scanner.nextInt();
            a[i] = w;
        }

        int qt = scanner.nextInt();
        for (int j = 0; j < qt; j++) {
            int q = scanner.nextInt();
            int sum = 0;
            for (int k = 0; k < t; k++) {
                sum = sum + a[k];
                if (sum >= q) {

                    sum = k + 1;
                    break;
                }
            }
            System.out.println(sum);
        }
    }


}
