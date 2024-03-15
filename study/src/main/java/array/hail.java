package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        list.add(n);
        while(n != 1){
            if (n % 2 == 0){
                n = n / 2;
                list.add(n);
            }else {
                n = n * 3 + 1;
                list.add(n);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
