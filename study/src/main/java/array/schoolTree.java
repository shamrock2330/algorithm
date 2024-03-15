package array;

import java.util.Arrays;
import java.util.Scanner;

public class schoolTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l =  sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[l + 1];
        Arrays.fill(arr,1 );
        for (int i = 0; i < m; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            for (int j = min; j <= max; j++) {
                arr[j] = 0;
            }
        }
        Arrays.sort(arr);
        int n = 0;
        for (int i = arr.length; i > 0; i--) {
            if (arr[i - 1] != 0){
                n++;
            }else {
                break;
            }
        }
        System.out.println(n);
    }
}
