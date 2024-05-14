package array;

import java.util.Scanner;

public class P1789插火把 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        boolean[][] map = new boolean[n][n];
        int[] dx = {-1, -2, 1, 2, 0, 0, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, 0, 0, 1, 2, -1, -2, -1, 1, -1, 1};
        int[] dx2 = {-1, -2, 1, 2, 0, 0, 0, 0, -1, -1, 1, 1, -1, -1, 1, 1, -2, -2, -2, -2, 2, 2, 2, 2};
        int[] dy2 = {0, 0, 0, 0, 1, 2, -1, -2, -1, 1, -1, 1, -2, 2, -2, 2, 1, -1, 2, -2, 1, 2, -1, -2};
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            map[x][y] = true;
            for (int j = 0; j < 12; j++) {
                int xx = x + dx[j];
                int yy = y + dy[j];
                if (xx >= 0 && yy >= 0 && xx < n && yy < n) {
                    map[xx][yy] = true;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            int x2 = sc.nextInt() - 1;
            int y2 = sc.nextInt() - 1;
            map[x2][y2] = true;
            for (int j = 0; j < 24; j++) {
                int xx2 = x2 + dx2[j];
                int yy2 = y2 + dy2[j];
                if (xx2 >= 0 && yy2 >= 0 && xx2 < n && yy2 < n) {
                    map[xx2][yy2] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!map[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
