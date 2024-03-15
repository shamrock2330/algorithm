package array;

import java.util.ArrayList;
import java.util.Scanner;

public class handicraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, n;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sum = a * b * c;
        n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int c1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            int c2 = sc.nextInt();
            for (int j = a1; j <= a2; j++) {
                for (int k = b1; k <= b2; k++) {
                    for (int l = c1; l <= c2; l++) {
                        String num = j + " " + k + " " + l;
                        if (!list.contains(num)) {
                            list.add(num);
                        }
                    }
                }
            }
        }
        System.out.println(sum - list.size());
    }
}
