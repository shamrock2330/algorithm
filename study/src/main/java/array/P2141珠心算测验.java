package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class P2141珠心算测验 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        arr.sort(Comparator.naturalOrder());
        for (int i = n - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr.contains((arr.get(i) - (int) arr.get(j))) && arr.indexOf((arr.get(i) - (int) arr.get(j))) != j) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
