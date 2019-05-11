import java.util.Arrays;
import java.util.Scanner;

public class MagicalArray {

    int getDivision(int n) {
        // sieve method for prime calculation
        boolean hash[] = new boolean[n + 1];
        Arrays.fill(hash, true);
        for (int p = 2; p * p < n; p++)
            if (hash[p])
                for (int i = p * 2; i < n; i += p)
                    hash[i] = false;
        int total = 1;
        for (int p = 2; p <= n; p++) {
            if (hash[p]) {
                int count = 0;
                if (n % p == 0) {
                    while (n % p == 0) {
                        n = n / p;
                        count++;
                    }
                    total = total * (count + 1);
                }
            }
        }
        return total;
    }

    static int countMinimumSteps(Integer array[]){
        Arrays.stream(array);
        return 0;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        Integer K = scanner.nextInt();
        Integer array[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
    }

}
