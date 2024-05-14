package array;

import java.util.Scanner;

public class Java作业题1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            if (N <= 0) {
                System.out.println("数据不合法，请重新输入");
            }
            if (N == 1 || N == 2) {
                System.out.println(N);
                return;
            }
            if (N > 2) {
                int[] arr = new int[N];
                arr[0] = arr[1] = 1;
                int sum = 2;
                for (int i = 2; i < N; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                    sum += arr[i];
                }
                System.out.println(sum);
                return;
            }
        }
    }
}
