package array;

import java.util.Scanner;

public class rival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c, sum, ans = 0;
        int[][] arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            sum = a + b + c;
            int[] item = {sum, a, b, c};
            arr[i] = item;
        }
        for (int i = 0; i < n; i++) {
            int sum1 = arr[i][0];
            for (int j = i + 1; j < n; j++) {
                int sum2 = arr[j][0];
                if (Math.abs(sum1 - sum2) <= 10) {
                    if (Math.abs(arr[i][1] - arr[j][1]) <= 5 && Math.abs(arr[i][2] - arr[j][2]) <= 5 && Math.abs(arr[i][3] - arr[j][3]) <= 5) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
