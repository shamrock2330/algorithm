package array;

import java.util.Scanner;

public class displayScreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int b;
        String arr = sc.next();
        sc.close();
        String list =
                "XXX...X.XXX.XXX.X.X.XXX.XXX.XXX.XXX.XXX" +
                        "X.X...X...X...X.X.X.X...X.....X.X.X.X.X" +
                        "X.X...X.XXX.XXX.XXX.XXX.XXX...X.XXX.XXX" +
                        "X.X...X.X.....X...X...X.X.X...X.X.X...X" +
                        "XXX...X.XXX.XXX...X.XXX.XXX...X.XXX.XXX";
        for (int i = 0; i < 5; i++) {//循环每一行
            a = 39 * i;//一行只有39个数据
            for (int k = 0; k < n; k++) {//循环每个一行
                b = arr.charAt(k);
                b = (b - '0') * 4 + a;
                for (int m = b; m < b + 3; m++)
                    System.out.print(list.charAt(m));
                if (k != n - 1)
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}
