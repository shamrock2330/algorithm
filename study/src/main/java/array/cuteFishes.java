package array;

import java.util.Scanner;

public class cuteFishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            int a = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]){
                    a++;
                }
            }
            System.out.print( a + " ");
        }
    }
}
