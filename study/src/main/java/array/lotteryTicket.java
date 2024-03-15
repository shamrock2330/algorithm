package array;

import java.util.ArrayList;
import java.util.Scanner;

public class lotteryTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ans = {0, 0, 0, 0, 0, 0, 0, 0};
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < 7; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            int s1 = 0;
            for (int j = 0; j < 7; j++) {
                if (arr.contains(sc.nextInt())) {
                    s1++;
                }
            }
            ans[7 - s1] += 1;
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
