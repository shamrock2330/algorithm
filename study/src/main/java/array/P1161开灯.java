package array;

import java.util.Scanner;

public class P1161开灯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] boos = new boolean[2000000];
        double[] dous = new double[n];
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            dous[i] = sc.nextDouble();
            ints[i] = sc.nextInt();
            for (int j = 1; j <= ints[i]; j++) {
                boos[(int) Math.floor(dous[i] * j)] = !boos[(int) Math.floor(dous[i] * j)];
            }
        }
        for (int i = 0; i < 2000000; i++) {
            if (boos[(int) Math.floor(i)]) {
                System.out.println(i);
                break;
            }
        }
    }
}
