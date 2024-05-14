package array;

import java.util.Scanner;

public class P1614爱与愁的心痛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int[] sums = new int[n - m + 1];
        for (int i = 0; i < sums.length; i++) {
            for (int j = i; j < i + m; j++) {
                sum += arr[j];
            }
            sums[i] = sum;
            sum = 0;
        }
        int min = sums[0];
        for (int i = 1; i < sums.length; i++) {
            if (min > sums[i]) {
                min = sums[i];
            }
        }
        System.out.println(min);
    }
}
