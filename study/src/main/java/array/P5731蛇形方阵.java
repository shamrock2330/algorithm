package array;

import java.util.Scanner;

//不知道需要循环多少次就需要使用while
public class P5731蛇形方阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int x = 0;
        int y = 0;
        int z = 1;
        arr[x][y] = z;
        z++;
        while (z <= n * n) {
            //向右走
            while (++y < n && arr[x][y] == 0) {
                arr[x][y] = z;
                z++;
            }
            y--;
            //向下走
            while (++x < n && arr[x][y] == 0) {
                arr[x][y] = z;
                z++;
            }
            x--;
            //向左走
            while (--y >= 0 && arr[x][y] == 0) {
                arr[x][y] = z;
                z++;
            }
            y++;
            //向上走
            while (--x >= 0 && arr[x][y] == 0) {
                arr[x][y] = z;
                z++;
            }
            x++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
