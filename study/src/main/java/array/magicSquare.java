package array;

import java.util.Scanner;

public class magicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        arr[0][n / 2] = 1;
        int x = 0;
        int y = n / 2;
        for (int i = 2; i <= n * n; i++) {
            if (x == 0) {
                if (y != n - 1) {
                    x = n - 1;
                    y = y + 1;
                } else if (y == n - 1) {
                    x += 1;
                }
            } else {
                if (y == n - 1) {
                    y = 0;
                    x -= 1;
                } else {
                    if (arr[x - 1][y + 1] + 1 == 1) {
                        x -= 1;
                        y += 1;
                    } else {
                        x += 1;
                    }
                }
            }
            arr[x][y] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
