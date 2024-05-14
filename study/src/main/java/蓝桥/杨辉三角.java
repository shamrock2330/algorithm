package 蓝桥;


import java.util.Arrays;

public class 杨辉三角 {
    public static void main(String[] args) {
        long[] arr = new long[10];
        Arrays.fill(arr, 2021);
        for (long i = 1; ; i++) {
            String s = i + "";
            char[] chars = s.toCharArray();
            for (char c : chars) {
                arr[c - '0']--;
            }
            for (int j = 0; j < 10; j++) {
                if (arr[j] <= 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
