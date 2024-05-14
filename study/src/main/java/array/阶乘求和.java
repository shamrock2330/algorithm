package array;

public class 阶乘求和 {
    public static void main(String[] args) {
        long sum = 0, res = 1;
        long x = (long) 1e9;
        for (int i = 1; i < 50; i++) {
            res = i * res % x;
            sum += res;
            sum %= x;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
