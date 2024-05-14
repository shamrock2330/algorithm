package array;

import java.util.Scanner;

public class Java作业题2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int N = sc.nextInt();
        if (N == 1) {
            System.out.println(0);
        }
        if (N > 1) {
            for (int i = 2; i <= N; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
