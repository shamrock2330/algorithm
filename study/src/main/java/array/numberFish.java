package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numberFish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            list.add(n);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
