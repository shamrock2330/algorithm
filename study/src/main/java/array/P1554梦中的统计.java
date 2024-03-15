package array;

import java.util.Scanner;

public class P1554梦中的统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = min; i <= max; i++) {
            String s = i + "";
            for (int j = 0; j < s.length(); j++) {
                int d = s.charAt(j) - '0';
                arr[d]++;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
