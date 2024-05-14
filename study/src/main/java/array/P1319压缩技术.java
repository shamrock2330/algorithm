package array;

import java.util.Scanner;

public class P1319压缩技术 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int n = Integer.parseInt(arr[0]);
        int index = 0;//记录此时的下标
        int x = 0;//记录此时应该输出的数
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < Integer.parseInt(arr[i]); j++) {
                if (x == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
                index++;
                if (index == n) {
                    System.out.println();
                    index = 0;
                }
            }
            if (x == 0) {
                x = 1;
            } else {
                x = 0;
            }
        }
    }
}
